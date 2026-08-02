package xsna;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicBoolean;
import one.video.stat.transport.internal.upload.UploadExecutionResult;
import ru.ok.android.api.core.ApiClient;
import ru.ok.android.api.core.ApiExecutableRequest;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.api.core.ApiRequestException;
import ru.ok.android.onelog.OneLogImplProxy;

/* compiled from: Uploader.kt */
/* loaded from: classes8.dex */
public final class pdq0 {
    public final mrk0 a;
    public final vw3 b;
    public final gzs<dbq0> c;
    public final f260 d;
    public final wzs<dbq0, UploadExecutionResult, s3q0> e;
    public final i100 f;
    public final AtomicBoolean g;
    public final Object h;
    public mbr i;
    public final bpn0 j;
    public final bpn0 k;
    public final bpn0 l;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Uploader.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a HANDLE_UPLOAD_FILE_IO_ERROR;
        public static final a HANDLE_UPLOAD_INVOCATION_ERROR;
        public static final a HANDLE_UPLOAD_REQUEST_ERROR;
        public static final a HANDLE_UPLOAD_UNKNOWN_ERROR;
        private final String value;

        static {
            a aVar = new a("HANDLE_UPLOAD_REQUEST_ERROR", 0, "ul_re");
            HANDLE_UPLOAD_REQUEST_ERROR = aVar;
            a aVar2 = new a("HANDLE_UPLOAD_INVOCATION_ERROR", 1, "ul_ie");
            HANDLE_UPLOAD_INVOCATION_ERROR = aVar2;
            a aVar3 = new a("HANDLE_UPLOAD_UNKNOWN_ERROR", 2, "ul_ue");
            HANDLE_UPLOAD_UNKNOWN_ERROR = aVar3;
            a aVar4 = new a("HANDLE_UPLOAD_FILE_IO_ERROR", 3, "ul_fie");
            HANDLE_UPLOAD_FILE_IO_ERROR = aVar4;
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
            $VALUES = aVarArr;
            $ENTRIES = new asp(aVarArr);
        }

        public a(String str, int i, String str2) {
            this.value = str2;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        @Override // java.lang.Enum
        public final String toString() {
            return this.value;
        }
    }

    /* compiled from: Uploader.kt */
    public final class b extends Handler {
        public b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            LinkedList linkedList;
            mbr mbrVar;
            UploadExecutionResult uploadExecutionResult;
            boolean z;
            super.handleMessage(message);
            if (message.what == 0) {
                pdq0 pdq0Var = pdq0.this;
                pdq0Var.f.o("Uploader", new rjg0(4));
                try {
                    ApiClient apiClient = OneLogImplProxy.INSTANCE.getApiClient();
                    if (!pdq0Var.g.get()) {
                        pdq0Var.f.m("Uploader", new xv0(27));
                        return;
                    }
                    synchronized (pdq0Var.h) {
                        try {
                            linkedList = new LinkedList();
                            long j = 0;
                            do {
                                dbq0 invoke = pdq0Var.c.invoke();
                                if (invoke == null) {
                                    break;
                                }
                                File file = invoke.a;
                                try {
                                    file.exists();
                                } catch (Throwable unused) {
                                }
                                try {
                                    file.isFile();
                                } catch (Throwable unused2) {
                                }
                                cvk.q(file);
                                pdq0Var.f.o("Uploader", new myd0(file, 18));
                                try {
                                    File file2 = invoke.a;
                                    try {
                                        z = file2.canRead();
                                    } catch (Throwable unused3) {
                                        z = false;
                                    }
                                    if (!z) {
                                        pdq0Var.b(invoke, UploadExecutionResult.UPLOAD_FILE_IO_ERROR);
                                    }
                                    long q = cvk.q(file2) + (!linkedList.isEmpty() ? 1 : 0);
                                    long j2 = pdq0Var.a.f;
                                    if (q > j2) {
                                        pdq0Var.f.o("Uploader", new sfs(q, pdq0Var));
                                        pdq0Var.b(invoke, UploadExecutionResult.UPLOAD_FILE_TOO_BIG);
                                    } else {
                                        long j3 = q + j;
                                        if (j3 > j2) {
                                            pdq0Var.f.o("Uploader", new wqf0(6));
                                            pdq0Var.b(invoke, UploadExecutionResult.SKIPPED);
                                            break;
                                        } else {
                                            linkedList.add(invoke);
                                            j = j3;
                                        }
                                    }
                                } catch (IOException e) {
                                    pdq0Var.b.b(false, a.HANDLE_UPLOAD_FILE_IO_ERROR, new com.vk.movika.sdk.android.defaultplayer.container.e(27, e, file));
                                    pdq0Var.b(invoke, UploadExecutionResult.UPLOAD_FILE_IO_ERROR);
                                }
                            } while (j < pdq0Var.a.f);
                            mbrVar = new mbr(j, linkedList);
                            pdq0Var.i = mbrVar;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (linkedList.isEmpty()) {
                        pdq0Var.f.k(new fog0(4));
                        return;
                    }
                    vw3 vw3Var = pdq0Var.b;
                    UploadExecutionResult uploadExecutionResult2 = UploadExecutionResult.UNKNOWN_ERROR;
                    i100 i100Var = pdq0Var.f;
                    i100Var.o("Uploader", new h6m0(mbrVar, 6));
                    try {
                        try {
                            try {
                                try {
                                    apiClient.execute((ApiExecutableRequest) pdq0Var.a(mbrVar));
                                    uploadExecutionResult = UploadExecutionResult.SUCCESS;
                                } catch (Throwable th2) {
                                    pdq0Var.c(uploadExecutionResult2);
                                    pdq0Var.d();
                                    throw th2;
                                }
                            } catch (IOException e2) {
                                i100Var.m("Uploader", new vpj0(e2, 9));
                                uploadExecutionResult = UploadExecutionResult.NETWORK_CONNECTION_ERROR;
                            }
                        } catch (Throwable th3) {
                            vw3Var.b(false, a.HANDLE_UPLOAD_UNKNOWN_ERROR, new lbc0(th3, 24));
                            uploadExecutionResult = UploadExecutionResult.UNKNOWN_ERROR;
                        }
                    } catch (ApiInvocationException e3) {
                        int errorCode = e3.getErrorCode();
                        if (errorCode == 2 || errorCode == 453 || errorCode == 102 || errorCode == 103) {
                            i100Var.o("Uploader", new fd90(12));
                        } else {
                            vw3Var.b(false, a.HANDLE_UPLOAD_INVOCATION_ERROR, new iia0(e3, 29));
                        }
                        uploadExecutionResult = UploadExecutionResult.INVOCATION_ERROR;
                    } catch (ApiRequestException e4) {
                        vw3Var.b(false, a.HANDLE_UPLOAD_REQUEST_ERROR, new tbe0(e4, 18));
                        uploadExecutionResult = UploadExecutionResult.REQUEST_ERROR;
                    }
                    pdq0Var.c(uploadExecutionResult);
                    pdq0Var.d();
                } catch (Exception unused4) {
                    pdq0Var.f.m("Uploader", new e6k0(3));
                }
            }
        }
    }

    public pdq0(mrk0 mrk0Var, vw3 vw3Var, gzs gzsVar, f260 f260Var, wzs wzsVar, up70 up70Var) {
        this.a = mrk0Var;
        this.b = vw3Var;
        this.c = gzsVar;
        this.d = f260Var;
        this.e = wzsVar;
        this.f = up70Var;
        ndq0 ndq0Var = new ndq0(this);
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        this.g = atomicBoolean;
        this.h = new Object();
        if (f260Var != null) {
            f260Var.b(ndq0Var);
            atomicBoolean.set(f260Var.a());
        }
        this.j = new bpn0(new kcc0(6));
        this.k = new bpn0(new tsk0(this, 12));
        this.l = new bpn0(new dei0(this, 18));
    }

    public final k9r a(mbr mbrVar) {
        String applicationParam = OneLogImplProxy.INSTANCE.getApplicationParam();
        mrk0 mrk0Var = this.a;
        return new k9r(applicationParam, mrk0Var.c, mrk0Var.b, mbrVar);
    }

    public final void b(dbq0 dbq0Var, UploadExecutionResult uploadExecutionResult) {
        this.f.o("Uploader", new k75(19, uploadExecutionResult, dbq0Var));
        this.e.invoke(dbq0Var, uploadExecutionResult);
    }

    public final void c(UploadExecutionResult uploadExecutionResult) {
        synchronized (this.h) {
            try {
                mbr mbrVar = this.i;
                if (mbrVar != null) {
                    Iterator it = mbrVar.b.iterator();
                    while (it.hasNext()) {
                        b((dbq0) it.next(), uploadExecutionResult);
                    }
                }
                this.i = null;
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        this.f.o("Uploader", new dqm0(2));
        bpn0 bpn0Var = this.l;
        ((b) bpn0Var.getValue()).removeMessages(0);
        ((b) bpn0Var.getValue()).obtainMessage(0).sendToTarget();
    }
}
