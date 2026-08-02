package defpackage;

import io.flutter.plugins.camerax.CameraXError;
import io.flutter.plugins.webviewflutter.AndroidWebKitError;
import java.util.List;
import kotlin.Result;

/* loaded from: classes4.dex */
public final /* synthetic */ class htb0 implements fe5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ tls b;

    public /* synthetic */ htb0(int i, tls tlsVar) {
        this.a = i;
        this.b = tlsVar;
    }

    @Override // defpackage.fe5
    public final void a(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        tls tlsVar = this.b;
        switch (i) {
            case 0:
                r941 r941Var = (r941) tlsVar;
                if (!(obj instanceof List)) {
                    r941Var.invoke(new Result(new Result.Failure(new AndroidWebKitError("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedRequestError'.", ""))));
                    break;
                } else {
                    List list = (List) obj;
                    if (list.size() <= 1) {
                        r941Var.invoke(new Result(zy11Var));
                        break;
                    } else {
                        r941Var.invoke(new Result(new Result.Failure(new AndroidWebKitError((String) list.get(0), (String) list.get(1), (String) list.get(2)))));
                        break;
                    }
                }
            case 1:
                r941 r941Var2 = (r941) tlsVar;
                if (!(obj instanceof List)) {
                    r941Var2.invoke(new Result(new Result.Failure(new AndroidWebKitError("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onPageFinished'.", ""))));
                    break;
                } else {
                    List list2 = (List) obj;
                    if (list2.size() <= 1) {
                        r941Var2.invoke(new Result(zy11Var));
                        break;
                    } else {
                        r941Var2.invoke(new Result(new Result.Failure(new AndroidWebKitError((String) list2.get(0), (String) list2.get(1), (String) list2.get(2)))));
                        break;
                    }
                }
            case 2:
                r941 r941Var3 = (r941) tlsVar;
                if (!(obj instanceof List)) {
                    r941Var3.invoke(new Result(new Result.Failure(new AndroidWebKitError("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedHttpAuthRequest'.", ""))));
                    break;
                } else {
                    List list3 = (List) obj;
                    if (list3.size() <= 1) {
                        r941Var3.invoke(new Result(zy11Var));
                        break;
                    } else {
                        r941Var3.invoke(new Result(new Result.Failure(new AndroidWebKitError((String) list3.get(0), (String) list3.get(1), (String) list3.get(2)))));
                        break;
                    }
                }
            case 3:
                r941 r941Var4 = (r941) tlsVar;
                if (!(obj instanceof List)) {
                    r941Var4.invoke(new Result(new Result.Failure(new AndroidWebKitError("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onFormResubmission'.", ""))));
                    break;
                } else {
                    List list4 = (List) obj;
                    if (list4.size() <= 1) {
                        r941Var4.invoke(new Result(zy11Var));
                        break;
                    } else {
                        r941Var4.invoke(new Result(new Result.Failure(new AndroidWebKitError((String) list4.get(0), (String) list4.get(1), (String) list4.get(2)))));
                        break;
                    }
                }
            case 4:
                r941 r941Var5 = (r941) tlsVar;
                if (!(obj instanceof List)) {
                    r941Var5.invoke(new Result(new Result.Failure(new AndroidWebKitError("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedSslError'.", ""))));
                    break;
                } else {
                    List list5 = (List) obj;
                    if (list5.size() <= 1) {
                        r941Var5.invoke(new Result(zy11Var));
                        break;
                    } else {
                        r941Var5.invoke(new Result(new Result.Failure(new AndroidWebKitError((String) list5.get(0), (String) list5.get(1), (String) list5.get(2)))));
                        break;
                    }
                }
            case 5:
                r941 r941Var6 = (r941) tlsVar;
                if (!(obj instanceof List)) {
                    r941Var6.invoke(new Result(new Result.Failure(new AndroidWebKitError("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onScaleChanged'.", ""))));
                    break;
                } else {
                    List list6 = (List) obj;
                    if (list6.size() <= 1) {
                        r941Var6.invoke(new Result(zy11Var));
                        break;
                    } else {
                        r941Var6.invoke(new Result(new Result.Failure(new AndroidWebKitError((String) list6.get(0), (String) list6.get(1), (String) list6.get(2)))));
                        break;
                    }
                }
            case 6:
                r941 r941Var7 = (r941) tlsVar;
                if (!(obj instanceof List)) {
                    r941Var7.invoke(new Result(new Result.Failure(new AndroidWebKitError("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.doUpdateVisitedHistory'.", ""))));
                    break;
                } else {
                    List list7 = (List) obj;
                    if (list7.size() <= 1) {
                        r941Var7.invoke(new Result(zy11Var));
                        break;
                    } else {
                        r941Var7.invoke(new Result(new Result.Failure(new AndroidWebKitError((String) list7.get(0), (String) list7.get(1), (String) list7.get(2)))));
                        break;
                    }
                }
            case 7:
                r941 r941Var8 = (r941) tlsVar;
                if (!(obj instanceof List)) {
                    r941Var8.invoke(new Result(new Result.Failure(new AndroidWebKitError("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedHttpError'.", ""))));
                    break;
                } else {
                    List list8 = (List) obj;
                    if (list8.size() <= 1) {
                        r941Var8.invoke(new Result(zy11Var));
                        break;
                    } else {
                        r941Var8.invoke(new Result(new Result.Failure(new AndroidWebKitError((String) list8.get(0), (String) list8.get(1), (String) list8.get(2)))));
                        break;
                    }
                }
            case 8:
                qd2 qd2Var = (qd2) tlsVar;
                if (!(obj instanceof List)) {
                    qd2Var.invoke(new Result(new Result.Failure(new AndroidWebKitError("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewPoint.pigeon_newInstance'.", ""))));
                    break;
                } else {
                    List list9 = (List) obj;
                    if (list9.size() <= 1) {
                        qd2Var.invoke(new Result(zy11Var));
                        break;
                    } else {
                        qd2Var.invoke(new Result(new Result.Failure(new AndroidWebKitError((String) list9.get(0), (String) list9.get(1), (String) list9.get(2)))));
                        break;
                    }
                }
            case 9:
                qd2 qd2Var2 = (qd2) tlsVar;
                if (!(obj instanceof List)) {
                    qd2Var2.invoke(new Result(new Result.Failure(new AndroidWebKitError("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.X509Certificate.pigeon_newInstance'.", ""))));
                    break;
                } else {
                    List list10 = (List) obj;
                    if (list10.size() <= 1) {
                        qd2Var2.invoke(new Result(zy11Var));
                        break;
                    } else {
                        qd2Var2.invoke(new Result(new Result.Failure(new AndroidWebKitError((String) list10.get(0), (String) list10.get(1), (String) list10.get(2)))));
                        break;
                    }
                }
            default:
                fu7 fu7Var = (fu7) tlsVar;
                if (!(obj instanceof List)) {
                    fu7Var.invoke(new Result(new Result.Failure(new CameraXError("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.camera_android_camerax.ZoomState.pigeon_newInstance'.", ""))));
                    break;
                } else {
                    List list11 = (List) obj;
                    if (list11.size() <= 1) {
                        fu7Var.invoke(new Result(zy11Var));
                        break;
                    } else {
                        fu7Var.invoke(new Result(new Result.Failure(new CameraXError((String) list11.get(0), (String) list11.get(1), (String) list11.get(2)))));
                        break;
                    }
                }
        }
    }
}
