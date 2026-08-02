package xsna;

import com.vk.core.files.PrivateFiles;
import com.vk.core.files.PrivateSubdir;
import com.vk.log.L;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.EmptyList;
import kotlin.text.Regex;
import xsna.nts0;

/* compiled from: ImVideoMessageCameraBridgeImpl.kt */
/* loaded from: classes7.dex */
public final class kew {
    public final AtomicBoolean a;
    public boolean b;
    public boolean c;
    public WeakReference<ung0> d = new WeakReference<>(null);
    public List<e0l0> e = EmptyList.b;
    public nts0.b f;

    public kew(AtomicBoolean atomicBoolean) {
        this.a = atomicBoolean;
    }

    public final File a() {
        PrivateFiles.a b;
        b = e8r.a.b(r1, PrivateSubdir.IM.h(), true);
        return new File(b.a, "video_msg_placeholder.png");
    }

    public final Float b() {
        ung0 ung0Var = this.d.get();
        if (ung0Var == null) {
            return null;
        }
        Float valueOf = Float.valueOf(ung0Var.getCameraZoomLevel());
        L.e("VideoMessageLog", n23.a(valueOf.floatValue(), "getZoom "));
        return valueOf;
    }

    public final void c(boolean z) {
        if (z) {
            ung0 ung0Var = this.d.get();
            if (ung0Var != null) {
                ung0Var.setFlashMode(2);
                return;
            }
            return;
        }
        ung0 ung0Var2 = this.d.get();
        if (ung0Var2 != null) {
            ung0Var2.setFlashMode(0);
        }
    }

    public final void d(int i) {
        Object obj;
        if (this.e.isEmpty()) {
            return;
        }
        List<e0l0> list = this.e;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((e0l0) obj).a == i) {
                    break;
                }
            }
        }
        e0l0 e0l0Var = (e0l0) obj;
        if (e0l0Var == null) {
            e0l0Var = (e0l0) j5g.Y(list);
        }
        ung0 ung0Var = this.d.get();
        if (ung0Var != null) {
            Integer j = p4g.j(e0l0Var, this.e);
            ung0Var.setCurrentStencilIdx(j != null ? j.intValue() : 0);
        }
    }

    public final void e(boolean z) {
        L.e("VideoMessageLog", zhy0.a("onStopRecordRequest force ", z));
        if (z) {
            ung0 ung0Var = this.d.get();
            if (ung0Var != null) {
                ung0Var.x(true);
                return;
            }
            return;
        }
        ung0 ung0Var2 = this.d.get();
        if (ung0Var2 != null) {
            ung0Var2.x(false);
        }
    }

    public final void f(float f) {
        L.e("VideoMessageLog", n23.a(f, "setZoom "));
        ung0 ung0Var = this.d.get();
        if (ung0Var != null) {
            ung0Var.setCameraZoomLevel(f);
        }
    }

    /* compiled from: ImVideoMessageCameraBridgeImpl.kt */
    public final class a implements qj9 {
        public a() {
        }

        @Override // xsna.qj9
        public final void c(long j, long j2) {
            nts0.a aVar;
            nts0.b bVar = kew.this.f;
            if (bVar == null || (aVar = nts0.this.c) == null) {
                return;
            }
            aVar.c(j);
        }

        @Override // xsna.qj9
        public final void e(int i) {
            kew kewVar = kew.this;
            if (i == 800) {
                L.e("VideoMessageLog", "MEDIA_RECORDER_INFO_MAX_DURATION_REACHED");
                ung0 ung0Var = kewVar.d.get();
                if (ung0Var != null) {
                    ung0Var.x(false);
                    return;
                }
                return;
            }
            switch (i) {
                case -1006:
                    L.e("VideoMessageLog", "RECORDER_INFO_STREAMING_DISCONNETCED");
                    break;
                case -1005:
                    L.e("VideoMessageLog", "RECORDER_INFO_STREAMING_CONNECTED");
                    break;
                case -1004:
                    L.e("VideoMessageLog", "RECORDER_INFO_STREAMING_STARTED");
                    break;
                case -1003:
                    L.e("VideoMessageLog", "RECORDER_INFO_PROCESSING_ENDED");
                    break;
                case -1002:
                    L.e("VideoMessageLog", "RECORDER_INFO_PROCESSING_STARTED");
                    break;
                case -1001:
                    L.e("VideoMessageLog", "RECORDER_INFO_RECORDING_STARTED");
                    nts0.b bVar = kewVar.f;
                    if (bVar != null) {
                        bVar.c();
                        break;
                    }
                    break;
                case -1000:
                    L.e("VideoMessageLog", "RECORDER_INFO_RECORDING_PREPARED");
                    break;
            }
        }

        @Override // xsna.qj9
        public final void f(File file, boolean z) {
            boolean z2;
            nts0.a aVar;
            L.e("VideoMessageLog", "onCancel isForceStop " + z + " file " + file);
            boolean z3 = false;
            if (file != null) {
                try {
                    z2 = file.exists();
                } catch (SecurityException unused) {
                    z2 = false;
                }
                if (z2) {
                    z3 = true;
                }
            }
            if (z3) {
                Regex regex = com.vk.core.files.a.a;
                vhk0.b(file);
            }
            nts0.b bVar = kew.this.f;
            if (bVar == null || (aVar = nts0.this.c) == null) {
                return;
            }
            aVar.a();
        }

        @Override // xsna.qj9
        public final void onError(int i) {
            L.e("VideoMessageLog", lhg.a(i, "onError what "));
        }

        @Override // xsna.qj9
        public final void onFinish(File file) {
            nts0.b bVar;
            L.e("VideoMessageLog", z9r.a(file, "onFinish file "));
            if (file == null || (bVar = kew.this.f) == null) {
                return;
            }
            nts0 nts0Var = nts0.this;
            nts0.a aVar = nts0Var.c;
            if (aVar != null) {
                aVar.b(file, nts0Var.v, nts0Var.e);
            }
            if (nts0Var.x) {
                nts0Var.getVideoMsgReporter().d(nts0Var.d, nts0Var.getCurrentUid().b, nts0Var.v, nts0Var.e);
            }
        }

        @Override // xsna.qj9
        public final void onStart() {
            nts0.b bVar = kew.this.f;
            if (bVar != null) {
                bVar.c();
            }
        }

        @Override // xsna.qj9
        public final void onStop() {
            L.e("VideoMessageLog", "onStop");
        }

        @Override // xsna.qj9
        public final void d() {
        }

        @Override // xsna.qj9
        public final void b(nhf0 nhf0Var) {
        }

        @Override // xsna.qj9
        public final void a(long j, long j2) {
        }
    }
}
