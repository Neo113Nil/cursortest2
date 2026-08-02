package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.widget.ImageView;
import com.vk.im.reactions.api.BigReactionAnimationsView;
import com.vk.im.reactions.impl.assets.ReactionAssetDrawable;
import com.vk.im.reactions.impl.assets.a;
import com.vk.rlottie.RLottieDrawable;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.Callable;
import xsna.hg1;

/* compiled from: ImReactionAnimationCoordinatorImpl.kt */
@SuppressLint({"CheckResult"})
/* loaded from: classes2.dex */
public final class uaw implements paw {
    public static final bpn0 e = new bpn0(new lk(18));
    public static final int f = cn70.b(144);
    public final com.vk.im.reactions.impl.assets.a a;
    public WeakReference<BigReactionAnimationsView> c;
    public final HashMap<a, Object> b = new HashMap<>();
    public io.reactivex.rxjava3.disposables.b d = new io.reactivex.rxjava3.disposables.b();

    /* compiled from: ImReactionAnimationCoordinatorImpl.kt */
    public static final class a {
        public final long a;
        public final int b;
        public final int c;

        public a(long j, int i, int i2) {
            this.a = j;
            this.b = i;
            this.c = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + shy.a(this.b, Long.hashCode(this.a) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AnimationDescriptor(dialogId=");
            sb.append(this.a);
            sb.append(", msgLocalId=");
            sb.append(this.b);
            sb.append(", reactionId=");
            return vu5.b(sb, this.c, ')');
        }
    }

    /* compiled from: ImReactionAnimationCoordinatorImpl.kt */
    public static final class b {
        public static int a() {
            return ((Number) uaw.e.getValue()).intValue();
        }
    }

    public uaw(a1w a1wVar, cbw cbwVar) {
        this.a = new com.vk.im.reactions.impl.assets.a(cbwVar);
        zxp zxpVar = a1wVar.l;
        io.reactivex.rxjava3.internal.operators.observable.i0 i0Var = new io.reactivex.rxjava3.internal.operators.observable.i0(zxpVar.a(), new hg1.x1(waw.c));
        asu0 asu0Var = asu0.a;
        i0Var.a0(asu0Var.d()).subscribe(new j50(new r50(1, this, uaw.class, "parseEvent", "parseEvent(Lcom/vk/im/engine/events/OnMsgUpdateReactionsEvent;)V", 0, 3), 25));
        new io.reactivex.rxjava3.internal.operators.observable.i0(zxpVar.a(), new hg1.x1(xaw.b)).a0(asu0Var.d()).subscribe(new ubq(new t50(1, this, uaw.class, "onPaidReactionSuccess", "onPaidReactionSuccess(Lcom/vk/im/engine/models/events/channels/OnChannelMsgPaidReactionSuccessEvent;)V", 0, 9), 9));
    }

    @Override // xsna.paw
    public final void a(int i, int i2, long j) {
        e(new a(j, i, i2));
    }

    @Override // xsna.paw
    public final void b(ImageView imageView, k0f0 k0f0Var) {
        BigReactionAnimationsView bigReactionAnimationsView;
        long j = k0f0Var.g;
        int i = k0f0Var.i;
        final int i2 = k0f0Var.a;
        a aVar = new a(j, i, i2);
        HashMap<a, Object> hashMap = this.b;
        boolean containsKey = hashMap.containsKey(aVar);
        com.vk.im.reactions.impl.assets.a aVar2 = this.a;
        if (containsKey) {
            if (!epx.f(hashMap.get(aVar), xx1.c)) {
                return;
            }
            WeakReference<BigReactionAnimationsView> weakReference = this.c;
            if (weakReference != null && (bigReactionAnimationsView = weakReference.get()) != null) {
                final int a2 = b.a();
                final int i3 = f;
                ReactionAssetDrawable reactionAssetDrawable = new ReactionAssetDrawable(a2, i3);
                g0f0 g0f0Var = reactionAssetDrawable.b;
                bigReactionAnimationsView.getLocationInWindow(g0f0Var.g);
                g0f0Var.f = new WeakReference<>(bigReactionAnimationsView);
                reactionAssetDrawable.e = new WeakReference<>(imageView);
                g0f0Var.e = new WeakReference<>(imageView);
                final zaw zawVar = aVar2.a;
                final Context context = imageView.getContext();
                io.reactivex.rxjava3.internal.operators.single.v vVar = new io.reactivex.rxjava3.internal.operators.single.v(new Callable() { // from class: xsna.yze0
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        zaw zawVar2 = zaw.this;
                        Context context2 = context;
                        int i4 = i2;
                        RLottieDrawable e2 = zawVar2.e(context2, true, i4, i3);
                        int i5 = a2;
                        return new a.C1134a(e2, zawVar2.e(context2, false, i4, i5), zawVar2.b(context2, false, i4, i5));
                    }
                });
                asu0 asu0Var = asu0.a;
                itg0.b(bigReactionAnimationsView, vVar.q(asu0Var.c()).m(asu0Var.d()).subscribe(new eiy(new hsc0(reactionAssetDrawable, 4), 15), new uu60(new ym1(com.vk.metrics.eventtracking.b.a, 11), 12)));
                reactionAssetDrawable.a = new fal(this, aVar, imageView);
                imageView.setImageDrawable(reactionAssetDrawable);
                hashMap.put(aVar, new vaw(new WeakReference(imageView)));
                return;
            }
        }
        imageView.setImageDrawable(k0f0Var.a == -2 ? aVar2.a(imageView, i2, b.a(), this.d) : com.vk.im.reactions.impl.assets.a.b(aVar2, imageView.getContext(), i2, b.a(), null, this.d, false, 40));
        hashMap.remove(aVar);
    }

    @Override // xsna.paw
    public final void c(int i, int i2, long j) {
        Set<a> keySet = this.b.keySet();
        if (!(keySet instanceof Collection) || !keySet.isEmpty()) {
            for (a aVar : keySet) {
                if (aVar.a == j && aVar.b == i) {
                    return;
                }
            }
        }
        e(new a(j, i, i2));
    }

    @Override // xsna.paw
    public final void d(long j) {
        this.b.entrySet().removeIf(new taw(new saw(j, 0), 0));
    }

    public final void e(a aVar) {
        HashMap<a, Object> hashMap = this.b;
        if (hashMap.containsKey(aVar)) {
            return;
        }
        hashMap.entrySet().removeIf(new raw(new nfj(aVar, 28), 0));
        hashMap.put(aVar, xx1.c);
    }
}
