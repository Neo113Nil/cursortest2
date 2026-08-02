package xsna;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.vk.core.dynamic_loader.DynamicException;
import com.vk.core.dynamic_loader.DynamicTask;
import com.vk.medianative.AudioNative;
import java.nio.ByteBuffer;
import org.chromium.net.NetError;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class zr4 implements gzs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ zr4(int i, io.reactivex.rxjava3.subjects.d dVar, olk0 olk0Var) {
        this.c = i;
        this.d = dVar;
        this.e = olk0Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // xsna.gzs
    public final Object invoke() {
        String str;
        Throwable unknown;
        switch (this.b) {
            case 0:
                return AudioNative.e((ByteBuffer) this.d, this.c, (int[]) this.e);
            default:
                io.reactivex.rxjava3.subjects.d dVar = (io.reactivex.rxjava3.subjects.d) this.d;
                olk0 olk0Var = (olk0) this.e;
                int i = this.c;
                DynamicTask b = com.vk.core.dynamic_loader.b.b(i);
                if (b != null) {
                    com.vk.core.dynamic_loader.b.g.remove(b);
                    uqn0 remove = com.vk.core.dynamic_loader.b.h.remove(b);
                    if (remove != null) {
                        remove.c();
                        vpo vpoVar = com.vk.core.dynamic_loader.b.a;
                        if (vpoVar != null) {
                            vpoVar.a(b, i, remove.a());
                        }
                    }
                }
                StringBuilder a = t33.a("Failed to load dynamic library - ", olk0Var.e().toString(), " error - ");
                int c = olk0Var.c();
                if (c != -100) {
                    switch (c) {
                        case NetError.ERR_UPLOAD_FILE_CHANGED /* -14 */:
                            str = "PLAY_STORE_NOT_FOUND";
                            break;
                        case NetError.ERR_OUT_OF_MEMORY /* -13 */:
                            str = "SPLITCOMPAT_COPY_ERROR";
                            break;
                        case NetError.ERR_INSUFFICIENT_RESOURCES /* -12 */:
                            str = "SPLITCOMPAT_EMULATION_ERROR";
                            break;
                        case -11:
                            str = "SPLITCOMPAT_VERIFICATION_ERROR";
                            break;
                        case -10:
                            str = "INSUFFICIENT_STORAGE";
                            break;
                        default:
                            switch (c) {
                                case -8:
                                    str = "INCOMPATIBLE_WITH_EXISTING_SESSION";
                                    break;
                                case -7:
                                    str = "ACCESS_DENIED";
                                    break;
                                case -6:
                                    str = "NETWORK_ERROR";
                                    break;
                                case -5:
                                    str = "API_NOT_AVAILABLE";
                                    break;
                                case -4:
                                    str = "SESSION_NOT_FOUND";
                                    break;
                                case -3:
                                    str = "INVALID_REQUEST";
                                    break;
                                case -2:
                                    str = "MODULE_UNAVAILABLE";
                                    break;
                                case -1:
                                    str = "ACTIVE_SESSIONS_LIMIT_EXCEEDED";
                                    break;
                                case 0:
                                    str = "NO_ERROR";
                                    break;
                                default:
                                    str = GrsBaseInfo.CountryCodeSource.UNKNOWN;
                                    break;
                            }
                    }
                } else {
                    str = "INTERNAL_ERROR";
                }
                a.append(str);
                a.append(" code - [");
                a.append(olk0Var.c());
                a.append("]}");
                String sb = a.toString();
                int c2 = olk0Var.c();
                if (c2 != -100) {
                    switch (c2) {
                        case NetError.ERR_UPLOAD_FILE_CHANGED /* -14 */:
                            unknown = new DynamicException.GooglePlay(sb, olk0Var.c());
                            break;
                        case NetError.ERR_OUT_OF_MEMORY /* -13 */:
                        case NetError.ERR_INSUFFICIENT_RESOURCES /* -12 */:
                        case -11:
                            break;
                        case -10:
                            unknown = new DynamicException.Storage(sb, olk0Var.c());
                            break;
                        default:
                            switch (c2) {
                                case -8:
                                case -4:
                                case -1:
                                    unknown = new DynamicException.Session(sb, olk0Var.c());
                                    break;
                                case -7:
                                case -5:
                                case -3:
                                case -2:
                                case 0:
                                    break;
                                case -6:
                                    unknown = new DynamicException.Network(sb, olk0Var.c());
                                    break;
                                default:
                                    unknown = new DynamicException.Unknown(sb, olk0Var.c());
                                    break;
                            }
                    }
                    dVar.onError(unknown);
                    return s3q0.a;
                }
                unknown = new DynamicException.Unknown(sb, olk0Var.c());
                dVar.onError(unknown);
                return s3q0.a;
        }
    }

    public /* synthetic */ zr4(ByteBuffer byteBuffer, int i, int[] iArr) {
        this.d = byteBuffer;
        this.c = i;
        this.e = iArr;
    }
}
