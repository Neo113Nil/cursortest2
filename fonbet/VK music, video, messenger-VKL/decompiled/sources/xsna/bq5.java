package xsna;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.TypedValue;
import com.unity3d.services.UnityAdsConstants;
import com.vk.avatar.api.border.AvatarBorderType;
import com.vk.avatar.impl.border.item.path.VKAvatarBorderPathBuilder;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.cq5;
import xsna.p9r0;
import xsna.t9r0;
import xsna.w9r0;

/* compiled from: AvatarBorderRepositoryImpl.kt */
/* loaded from: classes15.dex */
public final class bq5 implements aq5 {
    public final t9r0 b;
    public final hn00<a, j9r0, Context> c = new hn00<>(new b(2, this, bq5.class, "createAvatarBorder", "createAvatarBorder(Landroid/content/Context;Lcom/vk/avatar/impl/border/AvatarBorderRepositoryImpl$VKAvatarDataCacheKey;)Lcom/vk/avatar/api/border/VKAvatarBorder;", 0));

    /* compiled from: AvatarBorderRepositoryImpl.kt */
    public static final class a {
        public final u9r0 a;
        public final int b;
        public final xp5 c;

        public a(u9r0 u9r0Var, int i, xp5 xp5Var) {
            this.a = u9r0Var;
            this.b = i;
            this.c = xp5Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + shy.a(this.b, this.a.hashCode() * 31, 31);
        }

        public final String toString() {
            return "VKAvatarDataCacheKey(config=" + this.a + ", themeId=" + this.b + ", avatarBorderColorsProvider=" + this.c + ')';
        }
    }

    /* compiled from: AvatarBorderRepositoryImpl.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements wzs<Context, a, j9r0> {
        /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Object, kotlin.Lazy] */
        /* JADX WARN: Type inference failed for: r14v7, types: [java.lang.Object, kotlin.Lazy] */
        @Override // xsna.wzs
        public final j9r0 invoke(Context context, a aVar) {
            bgd bgdVar;
            t9r0 t9r0Var;
            u9r0 u9r0Var;
            float f;
            r9r0 r9r0Var;
            r9r0 r9r0Var2;
            r9r0 r9r0Var3;
            p9r0.c a;
            Context context2 = context;
            a aVar2 = aVar;
            t9r0 t9r0Var2 = ((bq5) this.receiver).b;
            u9r0 u9r0Var2 = aVar2.a;
            AvatarBorderType avatarBorderType = u9r0Var2.c;
            xp5 xp5Var = aVar2.c;
            cq5 cq5Var = u9r0Var2.d;
            l9r0 l9r0Var = u9r0Var2.b;
            w9r0 w9r0Var = u9r0Var2.e;
            if (w9r0Var != null) {
                Path path = new Path();
                path.setFillType(Path.FillType.INVERSE_WINDING);
                if (w9r0Var instanceof w9r0.a) {
                    w9r0.a aVar3 = (w9r0.a) w9r0Var;
                    path.addCircle(aVar3.a, aVar3.b, aVar3.c, Path.Direction.CW);
                } else if (w9r0Var instanceof w9r0.b) {
                    path.addRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Path.Direction.CW);
                } else {
                    if (!(w9r0Var instanceof w9r0.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    w9r0.c cVar = (w9r0.c) w9r0Var;
                    path.addRoundRect(cVar.a, cVar.b, cVar.c, cVar.d, cVar.e, cVar.f, Path.Direction.CW);
                }
                path.close();
                bgdVar = new bgd(path);
            } else {
                bgdVar = null;
            }
            Path path2 = bgdVar != null ? (Path) bgdVar.a : null;
            float f2 = u9r0Var2.a / 2.0f;
            Path a2 = (t9r0.a.$EnumSwitchMapping$0[avatarBorderType.ordinal()] == 1 ? (VKAvatarBorderPathBuilder) t9r0Var2.b.getValue() : (VKAvatarBorderPathBuilder) t9r0Var2.a.getValue()).a(f2, f2, tdq.a(u9r0Var2), VKAvatarBorderPathBuilder.PathPurpose.CROP_AVATAR);
            if (path2 != null) {
                Path path3 = new Path();
                path3.addPath(a2);
                path3.op(path2, Path.Op.INTERSECT);
                a2 = path3;
            }
            bgd bgdVar2 = new bgd(a2);
            boolean z = l9r0Var.a;
            boolean z2 = l9r0Var.e;
            float f3 = l9r0Var.c;
            float f4 = l9r0Var.g;
            if (z) {
                Integer num = l9r0Var.b;
                if (num != null) {
                    f = 2.0f;
                    a = new p9r0.c(num.intValue());
                } else {
                    f = 2.0f;
                    xp5Var.getClass();
                    a = x9r0.a(R.attr.vk_ui_background_content, context2);
                }
                AvatarBorderType avatarBorderType2 = AvatarBorderType.CIRCLE;
                float f5 = avatarBorderType == avatarBorderType2 ? f4 : f3;
                float f6 = epx.f(cq5Var, cq5.b.a) ? avatarBorderType == avatarBorderType2 ? f4 / f : (f4 / f) + f3 : epx.f(cq5Var, cq5.m.a) ? f4 * 0.75f : l9r0Var.h * 1.25f;
                t9r0Var = t9r0Var2;
                u9r0Var = u9r0Var2;
                r9r0Var = t9r0Var.a(u9r0Var, context2, tdq.a(u9r0Var2) + f6, f5, Paint.Style.FILL_AND_STROKE, a);
            } else {
                t9r0Var = t9r0Var2;
                u9r0Var = u9r0Var2;
                f = 2.0f;
                r9r0Var = null;
            }
            cq5.b bVar = cq5.b.a;
            int i = !epx.f(cq5Var, bVar) ? 1 : 0;
            if (z2) {
                i++;
            }
            ArrayList arrayList = new ArrayList(i);
            if (epx.f(cq5Var, bVar)) {
                r9r0Var2 = null;
            } else {
                float b = tdq.b(u9r0Var);
                float f7 = l9r0Var.g;
                if (epx.f(cq5Var, cq5.m.a)) {
                    f7 /= f;
                }
                r9r0Var2 = t9r0Var.a(u9r0Var, context2, b, f7, Paint.Style.STROKE, q9r0.a(context2, cq5Var, l9r0Var, xp5Var));
            }
            if (r9r0Var2 != null) {
                arrayList.add(r9r0Var2);
            }
            if (z2) {
                float a3 = tdq.a(u9r0Var) - hbh0.a(context2, 0.25f);
                float a4 = hbh0.a(context2, 0.5f);
                xp5Var.getClass();
                r9r0Var3 = t9r0Var.a(u9r0Var, context2, a3, a4, Paint.Style.STROKE, new p9r0.c(context2.getColor(R.color.vk_black_alpha8)));
            } else {
                r9r0Var3 = null;
            }
            if (r9r0Var3 != null) {
                arrayList.add(r9r0Var3);
            }
            return new j9r0(u9r0Var.a, bgdVar2, r9r0Var, arrayList, bgdVar);
        }
    }

    public bq5(t9r0 t9r0Var, q9r0 q9r0Var) {
        this.b = t9r0Var;
    }

    @Override // xsna.aq5
    public final int a(Context context, cq5 cq5Var, u9r0 u9r0Var, xp5 xp5Var) {
        if (u9r0Var == null) {
            xp5Var.getClass();
            return krv0.m(R.attr.vk_ui_stroke_accent, context);
        }
        p9r0 a2 = q9r0.a(context, cq5Var, u9r0Var.b, xp5Var);
        if (!(a2 instanceof p9r0.c)) {
            return krv0.m(xp5Var.a(), context);
        }
        p9r0.c cVar = (p9r0.c) a2;
        int i = cVar.a;
        xp5Var.getClass();
        return i == 0 ? krv0.m(xp5Var.a(), context) : cVar.a;
    }

    /* JADX WARN: Finally extract failed */
    @Override // xsna.aq5
    public final j9r0 b(Context context, u9r0 u9r0Var, xp5 xp5Var) {
        Integer b2;
        if (context instanceof l7s) {
            b2 = Integer.valueOf(((l7s) context).getThemeResId());
        } else {
            TypedValue typedValue = krv0.a;
            b2 = krv0.b();
        }
        int i = 0;
        a aVar = new a(u9r0Var, b2 != null ? b2.intValue() : 0, xp5Var);
        hn00<a, j9r0, Context> hn00Var = this.c;
        LinkedHashMap linkedHashMap = hn00Var.c;
        ReentrantReadWriteLock reentrantReadWriteLock = hn00Var.b;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        readLock.lock();
        try {
            Object obj = linkedHashMap.get(aVar);
            if (obj == null) {
                ReentrantReadWriteLock.ReadLock readLock2 = reentrantReadWriteLock.readLock();
                int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
                for (int i2 = 0; i2 < readHoldCount; i2++) {
                    readLock2.unlock();
                }
                ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                writeLock.lock();
                try {
                    Object invoke = hn00Var.a.invoke(context, aVar);
                    linkedHashMap.put(aVar, invoke);
                    while (i < readHoldCount) {
                        readLock2.lock();
                        i++;
                    }
                    writeLock.unlock();
                    obj = invoke;
                } catch (Throwable th) {
                    while (i < readHoldCount) {
                        readLock2.lock();
                        i++;
                    }
                    writeLock.unlock();
                    throw th;
                }
            }
            readLock.unlock();
            return (j9r0) obj;
        } catch (Throwable th2) {
            readLock.unlock();
            throw th2;
        }
    }
}
