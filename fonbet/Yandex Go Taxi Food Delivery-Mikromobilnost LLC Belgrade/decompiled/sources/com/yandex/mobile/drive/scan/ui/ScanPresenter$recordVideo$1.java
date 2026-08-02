package com.yandex.mobile.drive.scan.ui;

import android.util.Size;
import androidx.camera.video.h;
import defpackage.hza1;
import defpackage.ir1;
import defpackage.l0b1;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pdy;
import defpackage.scc;
import defpackage.tse;
import defpackage.wls;
import defpackage.ycc;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.mobile.drive.scan.ui.ScanPresenter$recordVideo$1", f = "ScanPresenter.kt", l = {212, 504}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class ScanPresenter$recordVideo$1 extends SuspendLambda implements wls {
    final /* synthetic */ ScanMeta $scanMeta;
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScanPresenter$recordVideo$1(b bVar, ScanMeta scanMeta, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$scanMeta = scanMeta;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScanPresenter$recordVideo$1(this.this$0, this.$scanMeta, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScanPresenter$recordVideo$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00a9 A[Catch: all -> 0x0062, CancellationException -> 0x0065, TRY_ENTER, TryCatch #3 {CancellationException -> 0x0065, all -> 0x0062, blocks: (B:11:0x00a9, B:13:0x00ad, B:14:0x00b0, B:16:0x00b6, B:17:0x00b9, B:22:0x00e1, B:32:0x005d), top: B:2:0x000a, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0113  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x010d -> B:9:0x010f). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        int i;
        List list;
        b bVar;
        ScanMeta scanMeta;
        int i2;
        long j;
        int i3;
        int i4;
        pdy pdyVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = this.label;
        try {
            try {
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable th2) {
                th = th2;
                if (th != null) {
                    th = th;
                }
                this.L$0 = list;
                this.L$1 = bVar;
                this.L$2 = scanMeta;
                this.L$3 = th;
                this.L$4 = null;
                this.I$0 = i2;
                this.J$0 = j;
                this.I$1 = i3;
                this.I$2 = i4;
                this.label = 2;
                if (kotlinx.coroutines.a.i(j, this) != coroutineSingletons) {
                    th = th;
                    i = i4;
                }
            }
        } catch (Throwable th3) {
            l0b1.h(new AssertionError("takeVideo failure", th3));
            ir1.a(this.this$0.l, null, null, null, HProv.PP_DELETE_SAVED_PASSWD);
        }
        if (i5 != 0) {
            if (i5 == 1) {
                i4 = this.I$2;
                i3 = this.I$1;
                j = this.J$0;
                i2 = this.I$0;
                pdyVar = (pdy) this.L$4;
                th = (Throwable) this.L$3;
                scanMeta = (ScanMeta) this.L$2;
                bVar = (b) this.L$1;
                list = (List) this.L$0;
                kotlin.b.b(obj);
                bVar.q = pdyVar;
                b.b(bVar, pdyVar, scanMeta, (Size) ycc.y(list));
                return zy11.a;
            }
            if (i5 != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.I$2;
            int i6 = this.I$1;
            long j2 = this.J$0;
            int i7 = this.I$0;
            Throwable th4 = (Throwable) this.L$3;
            ScanMeta scanMeta2 = (ScanMeta) this.L$2;
            b bVar2 = (b) this.L$1;
            List list2 = (List) this.L$0;
            kotlin.b.b(obj);
            list = list2;
            bVar = bVar2;
            scanMeta = scanMeta2;
            th = th4;
            i2 = i7;
            j = j2;
            i3 = i6;
            i4 = i + 1;
            if (i4 < i2) {
                if (th == null) {
                    return zy11.a;
                }
                throw th;
            }
            pdy pdyVar2 = bVar.q;
            if (pdyVar2 != null) {
                pdyVar2.z();
            }
            bVar.q = null;
            h hVar = bVar.r;
            if (hVar != null) {
                hVar.close();
            }
            bVar.r = null;
            pdyVar = new pdy(bVar.c);
            Executor executor = bVar.A;
            this.L$0 = list;
            this.L$1 = bVar;
            this.L$2 = scanMeta;
            this.L$3 = th;
            this.L$4 = pdyVar;
            this.I$0 = i2;
            this.J$0 = j;
            this.I$1 = i3;
            this.I$2 = i4;
            this.I$3 = 0;
            this.label = 1;
            if (hza1.b(pdyVar, executor, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            bVar.q = pdyVar;
            b.b(bVar, pdyVar, scanMeta, (Size) ycc.y(list));
            return zy11.a;
        }
        kotlin.b.b(obj);
        ArrayList i8 = scc.i(new Size(1080, 1920), new Size(720, 1280), new Size(480, 640), new Size(360, 480), null);
        int size = i8.size();
        list = i8;
        th = null;
        bVar = this.this$0;
        scanMeta = this.$scanMeta;
        j = 300;
        i3 = 0;
        i2 = size;
        i4 = 0;
        if (i4 < i2) {
        }
    }
}
