package defpackage;

import io.flutter.plugins.webviewflutter.AndroidWebKitError;
import java.util.List;
import kotlin.Result;

/* loaded from: classes4.dex */
public final /* synthetic */ class dtb0 implements fe5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gv40 b;

    public /* synthetic */ dtb0(gv40 gv40Var, int i) {
        this.a = i;
        this.b = gv40Var;
    }

    @Override // defpackage.fe5
    public final void a(Object obj) {
        int i = this.a;
        gv40 gv40Var = this.b;
        switch (i) {
            case 0:
                if (!(obj instanceof List)) {
                    gv40Var.invoke(new Result(new Result.Failure(new AndroidWebKitError("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsPrompt'.", ""))));
                    break;
                } else {
                    List list = (List) obj;
                    if (list.size() <= 1) {
                        gv40Var.invoke(new Result((String) list.get(0)));
                        break;
                    } else {
                        gv40Var.invoke(new Result(new Result.Failure(new AndroidWebKitError((String) list.get(0), (String) list.get(1), (String) list.get(2)))));
                        break;
                    }
                }
            case 1:
                if (!(obj instanceof List)) {
                    gv40Var.invoke(new Result(new Result.Failure(new AndroidWebKitError("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsAlert'.", ""))));
                    break;
                } else {
                    List list2 = (List) obj;
                    if (list2.size() <= 1) {
                        gv40Var.invoke(new Result(zy11.a));
                        break;
                    } else {
                        gv40Var.invoke(new Result(new Result.Failure(new AndroidWebKitError((String) list2.get(0), (String) list2.get(1), (String) list2.get(2)))));
                        break;
                    }
                }
            case 2:
                if (!(obj instanceof List)) {
                    gv40Var.invoke(new Result(new Result.Failure(new AndroidWebKitError("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onShowFileChooser'.", ""))));
                    break;
                } else {
                    List list3 = (List) obj;
                    if (list3.size() <= 1) {
                        if (list3.get(0) != null) {
                            gv40Var.invoke(new Result((List) list3.get(0)));
                            break;
                        } else {
                            gv40Var.invoke(new Result(new Result.Failure(new AndroidWebKitError("null-error", "Flutter api returned null value for non-null return value.", ""))));
                            break;
                        }
                    } else {
                        gv40Var.invoke(new Result(new Result.Failure(new AndroidWebKitError((String) list3.get(0), (String) list3.get(1), (String) list3.get(2)))));
                        break;
                    }
                }
            default:
                if (!(obj instanceof List)) {
                    gv40Var.invoke(new Result(new Result.Failure(new AndroidWebKitError("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsConfirm'.", ""))));
                    break;
                } else {
                    List list4 = (List) obj;
                    if (list4.size() <= 1) {
                        if (list4.get(0) != null) {
                            gv40Var.invoke(new Result((Boolean) list4.get(0)));
                            break;
                        } else {
                            gv40Var.invoke(new Result(new Result.Failure(new AndroidWebKitError("null-error", "Flutter api returned null value for non-null return value.", ""))));
                            break;
                        }
                    } else {
                        gv40Var.invoke(new Result(new Result.Failure(new AndroidWebKitError((String) list4.get(0), (String) list4.get(1), (String) list4.get(2)))));
                        break;
                    }
                }
        }
    }
}
