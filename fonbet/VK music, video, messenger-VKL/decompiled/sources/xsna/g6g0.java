package xsna;

import android.app.Activity;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Handler;
import android.os.Looper;
import android.view.PixelCopy;
import android.view.Surface;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: ReportViewModel.kt */
@b6l(c = "com.vk.overlaymenu.feature.report.ReportViewModel$getScreenshotPath$2", f = "ReportViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class g6g0 extends SuspendLambda implements wzs<yvj, spj<? super String>, Object> {
    final /* synthetic */ Activity $activity;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6g0(Activity activity, spj<? super g6g0> spjVar) {
        super(2, spjVar);
        this.$activity = activity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new g6g0(this.$activity, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super String> spjVar) {
        return ((g6g0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x017f A[Catch: all -> 0x0078, TryCatch #2 {all -> 0x0078, blocks: (B:5:0x001d, B:7:0x0055, B:9:0x007c, B:10:0x0085, B:12:0x008b, B:15:0x00a3, B:20:0x00a7, B:21:0x00ca, B:23:0x00d0, B:50:0x0122, B:53:0x0127, B:38:0x0176, B:41:0x017b, B:29:0x017f, B:30:0x0185, B:34:0x01a7, B:44:0x0171, B:56:0x011d, B:61:0x01af, B:62:0x01c5, B:64:0x01cb, B:66:0x01d9, B:68:0x01dd, B:69:0x0200, B:37:0x012f), top: B:4:0x001d, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x012f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0230 A[LOOP:4: B:88:0x0230->B:98:0x0230, LOOP_START, PHI: r2
      0x0230: PHI (r2v2 android.app.Activity) = (r2v1 android.app.Activity), (r2v11 android.app.Activity) binds: [B:87:0x022d, B:98:0x0230] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r0v14, types: [xsna.l370] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v38, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r0v67 */
    /* JADX WARN: Type inference failed for: r0v68 */
    /* JADX WARN: Type inference failed for: r0v69 */
    /* JADX WARN: Type inference failed for: r0v7, types: [T, android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r0v8, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r11v10, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r8v1, types: [xsna.l370] */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v2 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Activity activity;
        Result.Failure failure;
        Throwable a;
        boolean z;
        ?? r0;
        Activity activity2;
        boolean z2;
        boolean z3;
        Result.Failure failure2;
        boolean z4;
        Bitmap bitmap;
        ?? r16;
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        deh0 deh0Var = deh0.a;
        Activity activity3 = this.$activity;
        deh0Var.getClass();
        i0q0.b();
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        try {
            Object b = deh0.b((WindowManager) activity3.getSystemService(WindowManager.class), "mGlobal");
            ArrayList arrayList = new ArrayList((List) deh0.b(b, "mViews"));
            ArrayList arrayList2 = new ArrayList((List) deh0.b(b, "mRoots"));
            ArrayList arrayList3 = new ArrayList();
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                arrayList3.add(new rpx0((View) arrayList.get(i), arrayList2.get(i), (WindowManager.LayoutParams) ((View) arrayList.get(i)).getLayoutParams()));
            }
            ArrayList arrayList4 = new ArrayList();
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (!epx.f(((rpx0) next).a.getTag(37742015), rte0.n)) {
                    arrayList4.add(next);
                }
            }
            List D0 = j5g.D0(new uo8(1), arrayList4);
            Handler handler = new Handler(Looper.getMainLooper());
            List<rpx0> list = D0;
            ArrayList arrayList5 = new ArrayList(c5g.u(list, 10));
            for (rpx0 rpx0Var : list) {
                Window a2 = deh0.a(rpx0Var.a);
                int i2 = 27;
                if (a2 != null) {
                    try {
                        int width = rpx0Var.a.getWidth();
                        int height = rpx0Var.a.getHeight();
                        CountDownLatch countDownLatch = new CountDownLatch(1);
                        z2 = false;
                        z3 = false;
                        try {
                            ?? createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                            Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                            final zf1 zf1Var = new zf1(i2, ref$ObjectRef2, countDownLatch);
                            PixelCopy.request(a2, (Bitmap) createBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: xsna.ceh0
                                @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                                public final void onPixelCopyFinished(int i3) {
                                    izs.this.invoke(Integer.valueOf(i3));
                                }
                            }, handler);
                            s3q0 s3q0Var = s3q0.a;
                            countDownLatch.await(3L, TimeUnit.SECONDS);
                            failure2 = createBitmap;
                        } catch (Throwable th) {
                            th = th;
                            failure2 = new Result.Failure(th);
                            z3 = z2;
                            z4 = failure2 instanceof Result.Failure;
                            Object obj3 = failure2;
                            if (z4) {
                            }
                            bitmap = (Bitmap) obj3;
                            r16 = z3;
                            if (bitmap == null) {
                            }
                            if (bitmap == null) {
                            }
                            rpx0Var.a.getLocationOnScreen(new int[2]);
                            WindowManager.LayoutParams layoutParams = rpx0Var.c;
                            arrayList5.add(new kyf0(bitmap, layoutParams.dimAmount, r0[r16], r0[1], layoutParams.format != -3 ? true : r16));
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        z2 = false;
                    }
                    z4 = failure2 instanceof Result.Failure;
                    Object obj32 = failure2;
                    if (z4) {
                        obj32 = null;
                    }
                    bitmap = (Bitmap) obj32;
                    r16 = z3;
                } else {
                    r16 = 0;
                    bitmap = null;
                }
                if (bitmap == null) {
                    try {
                        Surface surface = (Surface) deh0.b(rpx0Var.b, "mSurface");
                        int width2 = rpx0Var.a.getWidth();
                        int height2 = rpx0Var.a.getHeight();
                        CountDownLatch countDownLatch2 = new CountDownLatch(1);
                        Bitmap createBitmap2 = Bitmap.createBitmap(width2, height2, Bitmap.Config.ARGB_8888);
                        Ref$ObjectRef ref$ObjectRef3 = new Ref$ObjectRef();
                        final zf1 zf1Var2 = new zf1(27, ref$ObjectRef3, countDownLatch2);
                        PixelCopy.request(surface, createBitmap2, new PixelCopy.OnPixelCopyFinishedListener() { // from class: xsna.beh0
                            @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                            public final void onPixelCopyFinished(int i3) {
                                izs.this.invoke(Integer.valueOf(i3));
                            }
                        }, handler);
                        s3q0 s3q0Var2 = s3q0.a;
                        countDownLatch2.await(3L, TimeUnit.SECONDS);
                        obj2 = createBitmap2;
                    } catch (Throwable th3) {
                        obj2 = new Result.Failure(th3);
                    }
                    boolean z5 = obj2 instanceof Result.Failure;
                    Object obj4 = obj2;
                    if (z5) {
                        obj4 = null;
                    }
                    bitmap = (Bitmap) obj4;
                }
                if (bitmap == null) {
                    bitmap = hyt0.a(rpx0Var.a);
                }
                rpx0Var.a.getLocationOnScreen(new int[2]);
                WindowManager.LayoutParams layoutParams2 = rpx0Var.c;
                arrayList5.add(new kyf0(bitmap, layoutParams2.dimAmount, r0[r16], r0[1], layoutParams2.format != -3 ? true : r16));
            }
            ?? r02 = ((kyf0) arrayList5.get(0)).a;
            Canvas canvas = new Canvas(r02);
            for (kyf0 kyf0Var : j5g.S(arrayList5, 1)) {
                if (kyf0Var.b < 1.0f && kyf0Var.e) {
                    Paint paint = new Paint();
                    paint.setColor(-16777216);
                    paint.setAlpha((int) (255 * kyf0Var.b));
                    canvas.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, r02.getWidth(), r02.getHeight(), paint);
                }
                activity = null;
                try {
                    canvas.drawBitmap(kyf0Var.a, kyf0Var.c, kyf0Var.d, (Paint) null);
                } catch (Throwable th4) {
                    th = th4;
                    failure = new Result.Failure(th);
                    a = Result.a(failure);
                    if (a != null) {
                    }
                    z = failure instanceof Result.Failure;
                    Object obj5 = failure;
                    if (z) {
                    }
                    r0 = (Bitmap) obj5;
                    ref$ObjectRef.element = r0;
                    ?? r03 = r0;
                    if (r0 == 0) {
                    }
                    if (r03 != 0) {
                    }
                }
            }
            activity = null;
            failure = r02;
        } catch (Throwable th5) {
            th = th5;
            activity = null;
            failure = new Result.Failure(th);
            a = Result.a(failure);
            if (a != null) {
            }
            z = failure instanceof Result.Failure;
            Object obj52 = failure;
            if (z) {
            }
            r0 = (Bitmap) obj52;
            ref$ObjectRef.element = r0;
            ?? r032 = r0;
            if (r0 == 0) {
            }
            if (r032 != 0) {
            }
        }
        a = Result.a(failure);
        if (a != null) {
            l370 l370Var = x290.k;
            ?? r8 = l370Var;
            if (l370Var == null) {
                r8 = activity;
            }
            r8.v(a);
        }
        z = failure instanceof Result.Failure;
        Object obj522 = failure;
        if (z) {
            obj522 = activity;
        }
        r0 = (Bitmap) obj522;
        ref$ObjectRef.element = r0;
        ?? r0322 = r0;
        if (r0 == 0) {
            while (true) {
                if (activity3 == null) {
                    activity2 = activity;
                    break;
                }
                if (activity3 instanceof Activity) {
                    activity2 = activity3;
                    break;
                }
                Activity activity4 = activity3 instanceof ContextWrapper ? activity3 : activity;
                activity3 = activity4 != null ? activity4.getBaseContext() : activity;
            }
            if (activity2 == null) {
                l370 l370Var2 = x290.k;
                ?? r04 = l370Var2;
                if (l370Var2 == null) {
                    r04 = activity;
                }
                r04.v(new IllegalStateException("Failed to create screenshot from non-activity context"));
                r0322 = activity;
            } else {
                CountDownLatch countDownLatch3 = new CountDownLatch(1);
                i0q0.j(new x(ref$ObjectRef, activity2, countDownLatch3, 3));
                countDownLatch3.await(3L, TimeUnit.SECONDS);
                r0322 = (Bitmap) ref$ObjectRef.element;
            }
        }
        return r0322 != 0 ? s3r0.a(r0322).getPath() : activity;
    }
}
