package xsna;

import com.vk.clips.sdk.shared.api.deps.SdkOriginalSoundStatus;
import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.clips.sdk.shared.api.utils.ClipFeedTooltip$ClipFeedTooltipType;
import com.vk.clips.sdk.shared.feed.model.FeedItem;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.random.Random;

/* compiled from: ClipFeedTooltipHelper.kt */
/* loaded from: classes17.dex */
public final class dzc {
    public static final List<Double> n = e43.l(Double.valueOf(0.3333333333333333d), Double.valueOf(0.2d), Double.valueOf(0.125d), Double.valueOf(0.07692307692307693d), Double.valueOf(0.047619047619047616d), Double.valueOf(0.029411764705882353d), Double.valueOf(0.01818181818181818d));
    public final ClipFeedTab a;
    public final zof b;
    public final xne c;
    public final vz50 d;
    public final w8l e;
    public boolean f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;

    /* compiled from: ClipFeedTooltipHelper.kt */
    public final class a extends h {
        public final List<Double> d;

        public a(dzc dzcVar) {
            super();
            this.d = Collections.singletonList(Double.valueOf(1.0d));
        }

        @Override // xsna.dzc.h
        public final boolean a() {
            return false;
        }

        @Override // xsna.dzc.h
        public final List<Double> b() {
            return this.d;
        }

        @Override // xsna.dzc.h
        public final boolean c(ClipFeedTab clipFeedTab) {
            return clipFeedTab.Bb();
        }

        @Override // xsna.dzc.h
        public final boolean d(SdkVideoFile sdkVideoFile) {
            return !g620.f().e().f().b();
        }

        @Override // xsna.dzc.h
        public final boolean e() {
            return true;
        }
    }

    /* compiled from: ClipFeedTooltipHelper.kt */
    public final class b extends h {
        public final List<Double> d;
        public final boolean e;

        public b(dzc dzcVar) {
            super();
            this.d = Collections.singletonList(Double.valueOf(1.0d));
            this.e = true;
        }

        @Override // xsna.dzc.h
        public final boolean a() {
            return this.e;
        }

        @Override // xsna.dzc.h
        public final List<Double> b() {
            return this.d;
        }

        @Override // xsna.dzc.h
        public final boolean c(ClipFeedTab clipFeedTab) {
            return clipFeedTab instanceof ClipFeedTab.SingleClipWithDecoration;
        }

        @Override // xsna.dzc.h
        public final boolean d(SdkVideoFile sdkVideoFile) {
            return true;
        }

        @Override // xsna.dzc.h
        public final boolean e() {
            return true;
        }
    }

    /* compiled from: ClipFeedTooltipHelper.kt */
    public final class c extends h {
        public final List<Double> d;

        public c(dzc dzcVar) {
            super();
            this.d = Collections.singletonList(Double.valueOf(1.0d));
        }

        @Override // xsna.dzc.h
        public final boolean a() {
            return false;
        }

        @Override // xsna.dzc.h
        public final List<Double> b() {
            return this.d;
        }

        @Override // xsna.dzc.h
        public final boolean c(ClipFeedTab clipFeedTab) {
            return clipFeedTab.Bb();
        }

        @Override // xsna.dzc.h
        public final boolean d(SdkVideoFile sdkVideoFile) {
            return (!g620.f().e().f().j() || g620.f().e().f().f() || sdkVideoFile.w1()) ? false : true;
        }

        @Override // xsna.dzc.h
        public final boolean e() {
            return true;
        }
    }

    /* compiled from: ClipFeedTooltipHelper.kt */
    public final class d extends h {
        public final List<Double> d;
        public boolean e;

        public d() {
            super();
            this.d = Collections.singletonList(Double.valueOf(1.0d));
        }

        @Override // xsna.dzc.h
        public final boolean a() {
            return false;
        }

        @Override // xsna.dzc.h
        public final List<Double> b() {
            return this.d;
        }

        @Override // xsna.dzc.h
        public final boolean c(ClipFeedTab clipFeedTab) {
            return clipFeedTab.Bb() && !(clipFeedTab instanceof ClipFeedTab.SingleAdv);
        }

        @Override // xsna.dzc.h
        public final boolean d(SdkVideoFile sdkVideoFile) {
            return (this.e || sdkVideoFile.X0() != null || g620.f().e().f().a()) ? false : true;
        }

        @Override // xsna.dzc.h
        public final boolean e() {
            zof zofVar = dzc.this.b;
            zofVar.e().getClass();
            zofVar.e().getClass();
            return false;
        }

        @Override // xsna.dzc.h
        public final void f(SdkVideoFile sdkVideoFile) {
            this.e = true;
            super.f(sdkVideoFile);
            g620.f().e().f().e();
        }
    }

    /* compiled from: ClipFeedTooltipHelper.kt */
    public final class e extends h {
        public final List<Double> d;
        public final boolean e;

        public e() {
            super();
            this.d = Collections.singletonList(Double.valueOf(1.0d));
            this.e = true;
        }

        @Override // xsna.dzc.h
        public final boolean a() {
            return this.e;
        }

        @Override // xsna.dzc.h
        public final List<Double> b() {
            return this.d;
        }

        @Override // xsna.dzc.h
        public final boolean c(ClipFeedTab clipFeedTab) {
            return clipFeedTab.Bb();
        }

        @Override // xsna.dzc.h
        public final boolean d(SdkVideoFile sdkVideoFile) {
            SdkClipVideoFile sdkClipVideoFile = sdkVideoFile instanceof SdkClipVideoFile ? (SdkClipVideoFile) sdkVideoFile : null;
            if (sdkClipVideoFile != null) {
                boolean z = sdkClipVideoFile.y8() == SdkOriginalSoundStatus.DENIED || sdkClipVideoFile.y8() == SdkOriginalSoundStatus.MODERATING || (sdkClipVideoFile.y8() == SdkOriginalSoundStatus.NONE && sdkClipVideoFile.V() == null);
                boolean a = dzc.this.c.a(sdkClipVideoFile);
                if (z && !a) {
                    return true;
                }
            }
            return false;
        }

        @Override // xsna.dzc.h
        public final boolean e() {
            return true;
        }
    }

    /* compiled from: ClipFeedTooltipHelper.kt */
    public final class f extends h {
        public final List<Double> d;

        public f(dzc dzcVar) {
            super();
            this.d = Collections.singletonList(Double.valueOf(1.0d));
        }

        @Override // xsna.dzc.h
        public final boolean a() {
            return false;
        }

        @Override // xsna.dzc.h
        public final List<Double> b() {
            return this.d;
        }

        @Override // xsna.dzc.h
        public final boolean c(ClipFeedTab clipFeedTab) {
            return clipFeedTab.Bb();
        }

        @Override // xsna.dzc.h
        public final boolean d(SdkVideoFile sdkVideoFile) {
            return !g620.f().e().f().j();
        }

        @Override // xsna.dzc.h
        public final boolean e() {
            return true;
        }
    }

    /* compiled from: ClipFeedTooltipHelper.kt */
    public final class g extends h {
        public final List<Double> d;

        public g(dzc dzcVar) {
            super();
            this.d = dzc.n;
        }

        @Override // xsna.dzc.h
        public final boolean a() {
            return false;
        }

        @Override // xsna.dzc.h
        public final List<Double> b() {
            return this.d;
        }

        @Override // xsna.dzc.h
        public final boolean c(ClipFeedTab clipFeedTab) {
            return clipFeedTab.Bb() && !(clipFeedTab instanceof ClipFeedTab.UserSubscriptions);
        }

        @Override // xsna.dzc.h
        public final boolean d(SdkVideoFile sdkVideoFile) {
            return !sdkVideoFile.U();
        }

        @Override // xsna.dzc.h
        public final boolean e() {
            return true;
        }
    }

    /* compiled from: ClipFeedTooltipHelper.kt */
    public abstract class h {
        public final HashSet<Integer> a = new HashSet<>();
        public int b;

        public h() {
        }

        public abstract boolean a();

        public abstract List<Double> b();

        public abstract boolean c(ClipFeedTab clipFeedTab);

        public abstract boolean d(SdkVideoFile sdkVideoFile);

        public abstract boolean e();

        public void f(SdkVideoFile sdkVideoFile) {
            this.a.add(Integer.valueOf(sdkVideoFile.o0()));
        }
    }

    /* compiled from: ClipFeedTooltipHelper.kt */
    public static final /* synthetic */ class i {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ClipFeedTooltip$ClipFeedTooltipType.values().length];
            try {
                iArr[ClipFeedTooltip$ClipFeedTooltipType.SCROLL_ONBOARDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ClipFeedTooltip$ClipFeedTooltipType.DOUBLE_TAP_ONBOARDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ClipFeedTooltip$ClipFeedTooltipType.SUBSCRIBE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ClipFeedTooltip$ClipFeedTooltipType.SOUND_CANNOT_BE_USED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ClipFeedTooltip$ClipFeedTooltipType.DECORATION_ONBOARDING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ClipFeedTooltip$ClipFeedTooltipType.FAST_FORWARD_ONBOARDING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ClipFeedTooltip$ClipFeedTooltipType.AUTHOR_SWIPE_ONBOARDING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public dzc(ClipFeedTab clipFeedTab, zof zofVar, xne xneVar, vz50 vz50Var, w8l w8lVar) {
        this.a = clipFeedTab;
        this.b = zofVar;
        this.c = xneVar;
        this.d = vz50Var;
        this.e = w8lVar;
        e4 e4Var = new e4(this, 11);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.g = msy.a(lazyThreadSafetyMode, e4Var);
        this.h = msy.a(lazyThreadSafetyMode, new il1(this, 15));
        this.i = msy.a(lazyThreadSafetyMode, new gy0(this, 19));
        this.j = msy.a(lazyThreadSafetyMode, new eu1(this, 16));
        this.k = msy.a(lazyThreadSafetyMode, new q(this, 15));
        this.l = msy.a(lazyThreadSafetyMode, new zy(this, 21));
        this.m = msy.a(lazyThreadSafetyMode, new yg(this, 18));
    }

    public final zyc a(SdkVideoFile sdkVideoFile, ClipFeedTooltip$ClipFeedTooltipType clipFeedTooltip$ClipFeedTooltipType) {
        h b2 = b(clipFeedTooltip$ClipFeedTooltipType);
        dzc dzcVar = dzc.this;
        boolean z = false;
        if (dzcVar.f && !dgd.f(sdkVideoFile) && b2.c(this.a) && b2.e()) {
            if (!b2.a()) {
                if ((b2 instanceof f) || (b2 instanceof c) || (b2 instanceof d) || (b2 instanceof a) || dzcVar.d.a()) {
                    Iterator<E> it = ClipFeedTooltip$ClipFeedTooltipType.h().iterator();
                    while (it.hasNext()) {
                        h b3 = dzcVar.b((ClipFeedTooltip$ClipFeedTooltipType) it.next());
                        if (b3.a() || !b3.a.contains(Integer.valueOf(sdkVideoFile.o0()))) {
                        }
                    }
                }
            }
            Random.b.getClass();
            if (Random.c.g() < b2.b().get(b2.b).doubleValue() && b2.d(sdkVideoFile)) {
                z = true;
            }
            if (z && b2.b < e43.h(b2.b())) {
                b2.b++;
            }
            return new zyc(z);
        }
        return new zyc(false);
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v21, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, kotlin.Lazy] */
    public final h b(ClipFeedTooltip$ClipFeedTooltipType clipFeedTooltip$ClipFeedTooltipType) {
        switch (i.$EnumSwitchMapping$0[clipFeedTooltip$ClipFeedTooltipType.ordinal()]) {
            case 1:
                return (f) this.g.getValue();
            case 2:
                return (c) this.h.getValue();
            case 3:
                return (g) this.i.getValue();
            case 4:
                return (e) this.j.getValue();
            case 5:
                return (b) this.k.getValue();
            case 6:
                return (d) this.l.getValue();
            case 7:
                return (a) this.m.getValue();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final void c(FeedItem feedItem) {
        if (feedItem instanceof FeedItem.f) {
            this.e.a(((FeedItem.f) feedItem).l);
        }
    }

    public final void d(SdkVideoFile sdkVideoFile, ClipFeedTooltip$ClipFeedTooltipType clipFeedTooltip$ClipFeedTooltipType, hjj0 hjj0Var) {
        b(clipFeedTooltip$ClipFeedTooltipType).f(sdkVideoFile);
        if (hjj0Var != null) {
            this.e.c();
        }
    }
}
