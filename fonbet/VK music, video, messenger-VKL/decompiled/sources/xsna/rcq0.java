package xsna;

import com.vk.clips.upload.ui.api.entities.ClipsUploadAnalyticsInfo;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipsCreateContext;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipsCreationScreenItem;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.gif;

/* compiled from: UploadStateHandler.kt */
/* loaded from: classes17.dex */
public final class rcq0 {
    public final ize a;
    public final nbf b;
    public boolean c = true;
    public final wi50 d = bay.a();

    /* compiled from: UploadStateHandler.kt */
    @b6l(c = "com.vk.clips.upload.ui.impl.compose.state.UploadStateHandler", f = "UploadStateHandler.kt", l = {38}, m = "handleState")
    public static final class a extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public a(spj<? super a> spjVar) {
            super(spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return rcq0.this.a(null, this);
        }
    }

    public rcq0(jze jzeVar, nbf nbfVar) {
        this.a = jzeVar;
        this.b = nbfVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0054 A[Catch: all -> 0x008a, TryCatch #0 {all -> 0x008a, blocks: (B:12:0x0050, B:14:0x0054, B:16:0x0058, B:18:0x0063, B:19:0x008c, B:20:0x008f, B:22:0x0093), top: B:11:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0093 A[Catch: all -> 0x008a, TRY_LEAVE, TryCatch #0 {all -> 0x008a, blocks: (B:12:0x0050, B:14:0x0054, B:16:0x0058, B:18:0x0063, B:19:0x008c, B:20:0x008f, B:22:0x0093), top: B:11:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r10v8, types: [xsna.ui50] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(gif gifVar, spj<? super s3q0> spjVar) {
        a aVar;
        int i;
        wi50 wi50Var;
        ize izeVar;
        try {
            if (spjVar instanceof a) {
                aVar = (a) spjVar;
                int i2 = aVar.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    aVar.label = i2 - Integer.MIN_VALUE;
                    Object obj = aVar.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = aVar.label;
                    if (i != 0) {
                        kotlin.a.a(obj);
                        if (gifVar instanceof gif.b) {
                            aVar.L$0 = gifVar;
                            wi50Var = this.d;
                            aVar.L$1 = wi50Var;
                            aVar.label = 1;
                            if (wi50Var.b(aVar) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                        return s3q0.a;
                    }
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ?? r10 = (ui50) aVar.L$1;
                    gif gifVar2 = (gif) aVar.L$0;
                    kotlin.a.a(obj);
                    wi50Var = r10;
                    gifVar = gifVar2;
                    if (this.c) {
                        nbf nbfVar = this.b;
                        if (nbfVar != null) {
                            ClipsUploadAnalyticsInfo m = ((gif.b) gifVar).m();
                            if (nbfVar.b == null) {
                                nbfVar.b = m;
                                UiTracker uiTracker = UiTracker.a;
                                new kod(UiTracker.c(), new MobileOfficialAppsClipsStat$TypeClipsCreationScreenItem(MobileOfficialAppsClipsStat$TypeClipsCreationScreenItem.EventType.OPEN_PUBLISH, new MobileOfficialAppsClipsStat$ClipsCreateContext(m.c, wrp.a(m.b))), nbfVar.a).q();
                            }
                        }
                        this.c = false;
                    }
                    izeVar = this.a;
                    if (izeVar != null) {
                        izeVar.a((gif.b) gifVar);
                        s3q0 s3q0Var = s3q0.a;
                    }
                    wi50Var.c(null);
                    return s3q0.a;
                }
            }
            if (this.c) {
            }
            izeVar = this.a;
            if (izeVar != null) {
            }
            wi50Var.c(null);
            return s3q0.a;
        } catch (Throwable th) {
            wi50Var.c(null);
            throw th;
        }
        aVar = new a(spjVar);
        Object obj2 = aVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = aVar.label;
        if (i != 0) {
        }
    }
}
