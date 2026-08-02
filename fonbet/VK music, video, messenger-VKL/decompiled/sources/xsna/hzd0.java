package xsna;

import android.content.Context;
import android.content.Intent;
import android.graphics.RectF;
import android.net.Uri;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.upload.impl.UploadNotification;
import com.vkontakte.android.R;
import xsna.bzd0;
import xsna.fzd0;
import xsna.kjw;

/* compiled from: ProfilePhotoUploadInteractorImpl.kt */
/* loaded from: classes5.dex */
public final class hzd0 implements fzd0 {
    public final Context a;
    public final r0e0 b;
    public final bzd0 c;

    public hzd0(Context context, r0e0 r0e0Var) {
        bzd0 bzd0Var = new bzd0();
        this.a = context;
        this.b = r0e0Var;
        this.c = bzd0Var;
    }

    public static void d(Context context, String str, RectF rectF, fzd0.b bVar) {
        com.vk.upload.impl.tasks.u uVar = new com.vk.upload.impl.tasks.u(str, bVar.b, bVar.c, rectF.left, rectF.top, rectF.right, rectF.bottom, bVar.h, bVar.i, true, bVar.j, bVar.k);
        com.vk.upload.impl.a.g(uVar, new UploadNotification.a(t2i0.a(context, 0, new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("vkontakte://profile/" + uVar.d)), 33554432), context.getString(R.string.photo_upload_ok), context.getString(R.string.photo_upload_ok_long)));
        com.vk.upload.impl.a.i(uVar);
    }

    @Override // xsna.fzd0
    public final void a(int i, int i2, Intent intent, fzd0.a aVar, String str, String str2) {
        if (intent == null || i2 == 0) {
            aVar.a(fzd0.c.a.a);
            return;
        }
        if (i == 3901 && i2 == -1) {
            String stringExtra = intent.getStringExtra(X3.i.b);
            boolean booleanExtra = intent.getBooleanExtra("post", false);
            boolean booleanExtra2 = intent.getBooleanExtra("story", false);
            c(this.a, new fzd0.b(stringExtra, this.b.a(), true, intent.getFloatExtra(TtmlNode.LEFT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), intent.getFloatExtra("top", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), intent.getFloatExtra(TtmlNode.RIGHT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), intent.getFloatExtra("bottom", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), booleanExtra, booleanExtra2, str, str2));
            aVar.a(fzd0.c.b.a);
        }
    }

    @Override // xsna.fzd0
    public final void c(final Context context, final fzd0.b bVar) {
        final String str = bVar.a;
        if (context == null || str == null) {
            return;
        }
        final Uri parse = Uri.parse(str.toString());
        final RectF rectF = new RectF(bVar.d, bVar.e, bVar.f, bVar.g);
        final bzd0 bzd0Var = this.c;
        io.reactivex.rxjava3.internal.operators.maybe.d dVar = new io.reactivex.rxjava3.internal.operators.maybe.d(new io.reactivex.rxjava3.functions.n() { // from class: xsna.yyd0
            /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
            /* JADX WARN: Removed duplicated region for block: B:42:0x00b4  */
            /* JADX WARN: Removed duplicated region for block: B:45:0x00b7  */
            @Override // io.reactivex.rxjava3.functions.n
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object get() {
                kjw.a aVar;
                RectF rectF2;
                Context context2 = e43.a;
                bzd0.a aVar2 = null;
                if (context2 == null) {
                    context2 = null;
                }
                Uri uri = parse;
                kjw.a g = kjw.g(context2, uri, false);
                int i = g.a;
                int i2 = g.b;
                if (i2 != 0 && i != 0) {
                    int max = Math.max(i2, i);
                    int min = Math.min(i2, i);
                    if (max / min > 2.99f) {
                        int i3 = (int) (min * 2.99f);
                        if (i2 < i) {
                            min = i3;
                            i3 = min;
                        }
                        aVar = new kjw.a(min, i3);
                        if (aVar != null) {
                            float f = 1;
                            float max2 = Math.max(aVar.b, aVar.a);
                            float max3 = Math.max(i2, i);
                            float f2 = (f - (max2 / max3)) / 2;
                            float f3 = max3 * f2;
                            RectF rectF3 = rectF;
                            float f4 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                            if (i2 < i) {
                                float f5 = rectF3.left;
                                float f6 = f5 <= f2 ? 0.0f : ((f5 * max3) - f3) / max2;
                                float f7 = f - rectF3.right;
                                float f8 = f7 > f2 ? f - (((max3 * f7) - f3) / max2) : 1.0f;
                                float f9 = rectF3.top;
                                if (f9 <= 1.0f) {
                                    f4 = f9;
                                }
                                rectF2 = new RectF(f6, f4, f8, rectF3.bottom);
                            } else {
                                float f10 = rectF3.top;
                                float f11 = f10 <= f2 ? 0.0f : ((f10 * max3) - f3) / max2;
                                float f12 = f - rectF3.bottom;
                                float f13 = f12 > f2 ? f - (((max3 * f12) - f3) / max2) : 1.0f;
                                float f14 = rectF3.left;
                                if (f14 <= 1.0f) {
                                    f4 = f14;
                                }
                                rectF2 = new RectF(f4, f11, rectF3.right, f13);
                            }
                            aVar2 = new bzd0.a(aVar, rectF2);
                        }
                        if (aVar2 != null) {
                            return io.reactivex.rxjava3.internal.operators.maybe.i.b;
                        }
                        kjw.a aVar3 = aVar2.a;
                        io.reactivex.rxjava3.internal.operators.maybe.c cVar = new io.reactivex.rxjava3.internal.operators.maybe.c(new jo3(uri, 28));
                        bzd0 bzd0Var2 = bzd0.this;
                        return new io.reactivex.rxjava3.internal.operators.maybe.u(new io.reactivex.rxjava3.internal.operators.maybe.o(new io.reactivex.rxjava3.internal.operators.maybe.o(cVar, new khc0(new d2y(bzd0Var2, aVar3), 1)), new hkc0(new z6u(bzd0Var2), 1)), new si60(new mgz(aVar2, 28), 4));
                    }
                }
                aVar = null;
                if (aVar != null) {
                }
                if (aVar2 != null) {
                }
            }
        });
        asu0 asu0Var = asu0.a;
        dVar.k(asu0Var.c()).n(asu0Var.d()).subscribe(new fsq(new rh4(this, context, bVar), 23), new b0y(new tuq(27), 19), new io.reactivex.rxjava3.functions.a(this) { // from class: xsna.gzd0
            @Override // io.reactivex.rxjava3.functions.a
            public final void run() {
                hzd0.d(context, str, rectF, bVar);
            }
        });
    }
}
