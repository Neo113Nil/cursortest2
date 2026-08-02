package defpackage;

import android.util.Log;
import io.flutter.plugins.camerax.CameraXError;
import io.flutter.plugins.webviewflutter.AndroidWebKitError;
import java.util.List;
import kotlin.Result;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final /* synthetic */ class nd2 implements fe5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ nd2(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.fe5
    public final void a(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        boolean z = false;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                cs0 cs0Var = (cs0) obj2;
                if (!(obj instanceof List)) {
                    cs0Var.invoke(new Result(new Result.Failure(new AndroidWebKitError("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.PigeonInternalInstanceManager.removeStrongReference'.", ""))));
                    break;
                } else {
                    List list = (List) obj;
                    if (list.size() <= 1) {
                        cs0Var.invoke(new Result(zy11Var));
                        break;
                    } else {
                        cs0Var.invoke(new Result(new Result.Failure(new AndroidWebKitError((String) list.get(0), (String) list.get(1), (String) list.get(2)))));
                        break;
                    }
                }
            case 1:
                cs0 cs0Var2 = (cs0) obj2;
                if (!(obj instanceof List)) {
                    cs0Var2.invoke(new Result(new Result.Failure(new CameraXError("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.camera_android_camerax.PigeonInternalInstanceManager.removeStrongReference'.", ""))));
                    break;
                } else {
                    List list2 = (List) obj;
                    if (list2.size() <= 1) {
                        cs0Var2.invoke(new Result(zy11Var));
                        break;
                    } else {
                        cs0Var2.invoke(new Result(new Result.Failure(new CameraXError((String) list2.get(0), (String) list2.get(1), (String) list2.get(2)))));
                        break;
                    }
                }
            case 2:
                uhx uhxVar = (uhx) obj2;
                if (obj != null) {
                    try {
                        z = ((JSONObject) obj).getBoolean("handled");
                    } catch (JSONException e) {
                        Log.e("KeyEventChannel", "Unable to unpack JSON message: " + e);
                    }
                }
                ((wvb1) uhxVar.b).j(z);
                break;
            case 3:
                qd2 qd2Var = (qd2) obj2;
                if (!(obj instanceof List)) {
                    qd2Var.invoke(new Result(new Result.Failure(new AndroidWebKitError("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.AndroidMessage.pigeon_newInstance'.", ""))));
                    break;
                } else {
                    List list3 = (List) obj;
                    if (list3.size() <= 1) {
                        qd2Var.invoke(new Result(zy11Var));
                        break;
                    } else {
                        qd2Var.invoke(new Result(new Result.Failure(new AndroidWebKitError((String) list3.get(0), (String) list3.get(1), (String) list3.get(2)))));
                        break;
                    }
                }
            case 4:
                fu7 fu7Var = (fu7) obj2;
                if (!(obj instanceof List)) {
                    fu7Var.invoke(new Result(new Result.Failure(new CameraXError("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.camera_android_camerax.AspectRatioStrategy.pigeon_newInstance'.", ""))));
                    break;
                } else {
                    List list4 = (List) obj;
                    if (list4.size() <= 1) {
                        fu7Var.invoke(new Result(zy11Var));
                        break;
                    } else {
                        fu7Var.invoke(new Result(new Result.Failure(new CameraXError((String) list4.get(0), (String) list4.get(1), (String) list4.get(2)))));
                        break;
                    }
                }
            case 5:
                fu7 fu7Var2 = (fu7) obj2;
                if (!(obj instanceof List)) {
                    fu7Var2.invoke(new Result(new Result.Failure(new CameraXError("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.camera_android_camerax.Camera.pigeon_newInstance'.", ""))));
                    break;
                } else {
                    List list5 = (List) obj;
                    if (list5.size() <= 1) {
                        fu7Var2.invoke(new Result(zy11Var));
                        break;
                    } else {
                        fu7Var2.invoke(new Result(new Result.Failure(new CameraXError((String) list5.get(0), (String) list5.get(1), (String) list5.get(2)))));
                        break;
                    }
                }
            case 6:
                fu7 fu7Var3 = (fu7) obj2;
                if (!(obj instanceof List)) {
                    fu7Var3.invoke(new Result(new Result.Failure(new CameraXError("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.camera_android_camerax.Camera2CameraControl.pigeon_newInstance'.", ""))));
                    break;
                } else {
                    List list6 = (List) obj;
                    if (list6.size() <= 1) {
                        fu7Var3.invoke(new Result(zy11Var));
                        break;
                    } else {
                        fu7Var3.invoke(new Result(new Result.Failure(new CameraXError((String) list6.get(0), (String) list6.get(1), (String) list6.get(2)))));
                        break;
                    }
                }
            case 7:
                gu7 gu7Var = (gu7) obj2;
                if (!(obj instanceof List)) {
                    gu7Var.invoke(new Result(new Result.Failure(new CameraXError("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.camera_android_camerax.Camera2CameraInfo.pigeon_newInstance'.", ""))));
                    break;
                } else {
                    List list7 = (List) obj;
                    if (list7.size() <= 1) {
                        gu7Var.invoke(new Result(zy11Var));
                        break;
                    } else {
                        gu7Var.invoke(new Result(new Result.Failure(new CameraXError((String) list7.get(0), (String) list7.get(1), (String) list7.get(2)))));
                        break;
                    }
                }
            case 8:
                gu7 gu7Var2 = (gu7) obj2;
                if (!(obj instanceof List)) {
                    gu7Var2.invoke(new Result(new Result.Failure(new CameraXError("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.camera_android_camerax.CameraCharacteristics.pigeon_newInstance'.", ""))));
                    break;
                } else {
                    List list8 = (List) obj;
                    if (list8.size() <= 1) {
                        gu7Var2.invoke(new Result(zy11Var));
                        break;
                    } else {
                        gu7Var2.invoke(new Result(new Result.Failure(new CameraXError((String) list8.get(0), (String) list8.get(1), (String) list8.get(2)))));
                        break;
                    }
                }
            case 9:
                fu7 fu7Var4 = (fu7) obj2;
                if (!(obj instanceof List)) {
                    fu7Var4.invoke(new Result(new Result.Failure(new CameraXError("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.camera_android_camerax.CameraCharacteristicsKey.pigeon_newInstance'.", ""))));
                    break;
                } else {
                    List list9 = (List) obj;
                    if (list9.size() <= 1) {
                        fu7Var4.invoke(new Result(zy11Var));
                        break;
                    } else {
                        fu7Var4.invoke(new Result(new Result.Failure(new CameraXError((String) list9.get(0), (String) list9.get(1), (String) list9.get(2)))));
                        break;
                    }
                }
            case 10:
                fu7 fu7Var5 = (fu7) obj2;
                if (!(obj instanceof List)) {
                    fu7Var5.invoke(new Result(new Result.Failure(new CameraXError("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.camera_android_camerax.CameraControl.pigeon_newInstance'.", ""))));
                    break;
                } else {
                    List list10 = (List) obj;
                    if (list10.size() <= 1) {
                        fu7Var5.invoke(new Result(zy11Var));
                        break;
                    } else {
                        fu7Var5.invoke(new Result(new Result.Failure(new CameraXError((String) list10.get(0), (String) list10.get(1), (String) list10.get(2)))));
                        break;
                    }
                }
            case 11:
                gu7 gu7Var3 = (gu7) obj2;
                if (!(obj instanceof List)) {
                    gu7Var3.invoke(new Result(new Result.Failure(new CameraXError("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.camera_android_camerax.CameraInfo.pigeon_newInstance'.", ""))));
                    break;
                } else {
                    List list11 = (List) obj;
                    if (list11.size() <= 1) {
                        gu7Var3.invoke(new Result(zy11Var));
                        break;
                    } else {
                        gu7Var3.invoke(new Result(new Result.Failure(new CameraXError((String) list11.get(0), (String) list11.get(1), (String) list11.get(2)))));
                        break;
                    }
                }
            case 12:
                fu7 fu7Var6 = (fu7) obj2;
                if (!(obj instanceof List)) {
                    fu7Var6.invoke(new Result(new Result.Failure(new CameraXError("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.camera_android_camerax.CameraIntegerRange.pigeon_newInstance'.", ""))));
                    break;
                } else {
                    List list12 = (List) obj;
                    if (list12.size() <= 1) {
                        fu7Var6.invoke(new Result(zy11Var));
                        break;
                    } else {
                        fu7Var6.invoke(new Result(new Result.Failure(new CameraXError((String) list12.get(0), (String) list12.get(1), (String) list12.get(2)))));
                        break;
                    }
                }
            case 13:
                gu7 gu7Var4 = (gu7) obj2;
                if (!(obj instanceof List)) {
                    gu7Var4.invoke(new Result(new Result.Failure(new CameraXError("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.camera_android_camerax.CameraPermissionsError.pigeon_newInstance'.", ""))));
                    break;
                } else {
                    List list13 = (List) obj;
                    if (list13.size() <= 1) {
                        gu7Var4.invoke(new Result(zy11Var));
                        break;
                    } else {
                        gu7Var4.invoke(new Result(new Result.Failure(new CameraXError((String) list13.get(0), (String) list13.get(1), (String) list13.get(2)))));
                        break;
                    }
                }
            case 14:
                gu7 gu7Var5 = (gu7) obj2;
                if (!(obj instanceof List)) {
                    gu7Var5.invoke(new Result(new Result.Failure(new CameraXError("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.camera_android_camerax.CameraSelector.pigeon_newInstance'.", ""))));
                    break;
                } else {
                    List list14 = (List) obj;
                    if (list14.size() <= 1) {
                        gu7Var5.invoke(new Result(zy11Var));
                        break;
                    } else {
                        gu7Var5.invoke(new Result(new Result.Failure(new CameraXError((String) list14.get(0), (String) list14.get(1), (String) list14.get(2)))));
                        break;
                    }
                }
            case 15:
                qd2 qd2Var2 = (qd2) obj2;
                if (!(obj instanceof List)) {
                    qd2Var2.invoke(new Result(new Result.Failure(new CameraXError("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.camera_android_camerax.CameraSize.pigeon_newInstance'.", ""))));
                    break;
                } else {
                    List list15 = (List) obj;
                    if (list15.size() <= 1) {
                        qd2Var2.invoke(new Result(zy11Var));
                        break;
                    } else {
                        qd2Var2.invoke(new Result(new Result.Failure(new CameraXError((String) list15.get(0), (String) list15.get(1), (String) list15.get(2)))));
                        break;
                    }
                }
            case 16:
                fu7 fu7Var7 = (fu7) obj2;
                if (!(obj instanceof List)) {
                    fu7Var7.invoke(new Result(new Result.Failure(new CameraXError("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.camera_android_camerax.CameraState.pigeon_newInstance'.", ""))));
                    break;
                } else {
                    List list16 = (List) obj;
                    if (list16.size() <= 1) {
                        fu7Var7.invoke(new Result(zy11Var));
                        break;
                    } else {
                        fu7Var7.invoke(new Result(new Result.Failure(new CameraXError((String) list16.get(0), (String) list16.get(1), (String) list16.get(2)))));
                        break;
                    }
                }
            case 17:
                fu7 fu7Var8 = (fu7) obj2;
                if (!(obj instanceof List)) {
                    fu7Var8.invoke(new Result(new Result.Failure(new CameraXError("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.camera_android_camerax.CameraStateStateError.pigeon_newInstance'.", ""))));
                    break;
                } else {
                    List list17 = (List) obj;
                    if (list17.size() <= 1) {
                        fu7Var8.invoke(new Result(zy11Var));
                        break;
                    } else {
                        fu7Var8.invoke(new Result(new Result.Failure(new CameraXError((String) list17.get(0), (String) list17.get(1), (String) list17.get(2)))));
                        break;
                    }
                }
            case 18:
                fu7 fu7Var9 = (fu7) obj2;
                if (!(obj instanceof List)) {
                    fu7Var9.invoke(new Result(new Result.Failure(new CameraXError("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.camera_android_camerax.CaptureRequest.pigeon_newInstance'.", ""))));
                    break;
                } else {
                    List list18 = (List) obj;
                    if (list18.size() <= 1) {
                        fu7Var9.invoke(new Result(zy11Var));
                        break;
                    } else {
                        fu7Var9.invoke(new Result(new Result.Failure(new CameraXError((String) list18.get(0), (String) list18.get(1), (String) list18.get(2)))));
                        break;
                    }
                }
            case 19:
                fu7 fu7Var10 = (fu7) obj2;
                if (!(obj instanceof List)) {
                    fu7Var10.invoke(new Result(new Result.Failure(new CameraXError("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.camera_android_camerax.CaptureRequestKey.pigeon_newInstance'.", ""))));
                    break;
                } else {
                    List list19 = (List) obj;
                    if (list19.size() <= 1) {
                        fu7Var10.invoke(new Result(zy11Var));
                        break;
                    } else {
                        fu7Var10.invoke(new Result(new Result.Failure(new CameraXError((String) list19.get(0), (String) list19.get(1), (String) list19.get(2)))));
                        break;
                    }
                }
            case 20:
                fu7 fu7Var11 = (fu7) obj2;
                if (!(obj instanceof List)) {
                    fu7Var11.invoke(new Result(new Result.Failure(new CameraXError("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.camera_android_camerax.CaptureRequestOptions.pigeon_newInstance'.", ""))));
                    break;
                } else {
                    List list20 = (List) obj;
                    if (list20.size() <= 1) {
                        fu7Var11.invoke(new Result(zy11Var));
                        break;
                    } else {
                        fu7Var11.invoke(new Result(new Result.Failure(new CameraXError((String) list20.get(0), (String) list20.get(1), (String) list20.get(2)))));
                        break;
                    }
                }
            case 21:
                qd2 qd2Var3 = (qd2) obj2;
                if (!(obj instanceof List)) {
                    qd2Var3.invoke(new Result(new Result.Failure(new AndroidWebKitError("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.Certificate.pigeon_newInstance'.", ""))));
                    break;
                } else {
                    List list21 = (List) obj;
                    if (list21.size() <= 1) {
                        qd2Var3.invoke(new Result(zy11Var));
                        break;
                    } else {
                        qd2Var3.invoke(new Result(new Result.Failure(new AndroidWebKitError((String) list21.get(0), (String) list21.get(1), (String) list21.get(2)))));
                        break;
                    }
                }
            case 22:
                qd2 qd2Var4 = (qd2) obj2;
                if (!(obj instanceof List)) {
                    qd2Var4.invoke(new Result(new Result.Failure(new AndroidWebKitError("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.ClientCertRequest.pigeon_newInstance'.", ""))));
                    break;
                } else {
                    List list22 = (List) obj;
                    if (list22.size() <= 1) {
                        qd2Var4.invoke(new Result(zy11Var));
                        break;
                    } else {
                        qd2Var4.invoke(new Result(new Result.Failure(new AndroidWebKitError((String) list22.get(0), (String) list22.get(1), (String) list22.get(2)))));
                        break;
                    }
                }
            case 23:
                qd2 qd2Var5 = (qd2) obj2;
                if (!(obj instanceof List)) {
                    qd2Var5.invoke(new Result(new Result.Failure(new AndroidWebKitError("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.ConsoleMessage.pigeon_newInstance'.", ""))));
                    break;
                } else {
                    List list23 = (List) obj;
                    if (list23.size() <= 1) {
                        qd2Var5.invoke(new Result(zy11Var));
                        break;
                    } else {
                        qd2Var5.invoke(new Result(new Result.Failure(new AndroidWebKitError((String) list23.get(0), (String) list23.get(1), (String) list23.get(2)))));
                        break;
                    }
                }
            case 24:
                qd2 qd2Var6 = (qd2) obj2;
                if (!(obj instanceof List)) {
                    qd2Var6.invoke(new Result(new Result.Failure(new AndroidWebKitError("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.CookieManager.pigeon_newInstance'.", ""))));
                    break;
                } else {
                    List list24 = (List) obj;
                    if (list24.size() <= 1) {
                        qd2Var6.invoke(new Result(zy11Var));
                        break;
                    } else {
                        qd2Var6.invoke(new Result(new Result.Failure(new AndroidWebKitError((String) list24.get(0), (String) list24.get(1), (String) list24.get(2)))));
                        break;
                    }
                }
            case 25:
                qd2 qd2Var7 = (qd2) obj2;
                if (!(obj instanceof List)) {
                    qd2Var7.invoke(new Result(new Result.Failure(new AndroidWebKitError("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.CustomViewCallback.pigeon_newInstance'.", ""))));
                    break;
                } else {
                    List list25 = (List) obj;
                    if (list25.size() <= 1) {
                        qd2Var7.invoke(new Result(zy11Var));
                        break;
                    } else {
                        qd2Var7.invoke(new Result(new Result.Failure(new AndroidWebKitError((String) list25.get(0), (String) list25.get(1), (String) list25.get(2)))));
                        break;
                    }
                }
            case 26:
                gu7 gu7Var6 = (gu7) obj2;
                if (!(obj instanceof List)) {
                    gu7Var6.invoke(new Result(new Result.Failure(new CameraXError("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.camera_android_camerax.DisplayOrientedMeteringPointFactory.pigeon_newInstance'.", ""))));
                    break;
                } else {
                    List list26 = (List) obj;
                    if (list26.size() <= 1) {
                        gu7Var6.invoke(new Result(zy11Var));
                        break;
                    } else {
                        gu7Var6.invoke(new Result(new Result.Failure(new CameraXError((String) list26.get(0), (String) list26.get(1), (String) list26.get(2)))));
                        break;
                    }
                }
            case 27:
                c0m c0mVar = (c0m) obj2;
                if (!(obj instanceof List)) {
                    c0mVar.invoke(new Result(new Result.Failure(new AndroidWebKitError("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.DownloadListener.onDownloadStart'.", ""))));
                    break;
                } else {
                    List list27 = (List) obj;
                    if (list27.size() <= 1) {
                        c0mVar.invoke(new Result(zy11Var));
                        break;
                    } else {
                        c0mVar.invoke(new Result(new Result.Failure(new AndroidWebKitError((String) list27.get(0), (String) list27.get(1), (String) list27.get(2)))));
                        break;
                    }
                }
            case 28:
                fu7 fu7Var12 = (fu7) obj2;
                if (!(obj instanceof List)) {
                    fu7Var12.invoke(new Result(new Result.Failure(new CameraXError("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.camera_android_camerax.ExposureState.pigeon_newInstance'.", ""))));
                    break;
                } else {
                    List list28 = (List) obj;
                    if (list28.size() <= 1) {
                        fu7Var12.invoke(new Result(zy11Var));
                        break;
                    } else {
                        fu7Var12.invoke(new Result(new Result.Failure(new CameraXError((String) list28.get(0), (String) list28.get(1), (String) list28.get(2)))));
                        break;
                    }
                }
            default:
                fu7 fu7Var13 = (fu7) obj2;
                if (!(obj instanceof List)) {
                    fu7Var13.invoke(new Result(new Result.Failure(new CameraXError("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.camera_android_camerax.FallbackStrategy.pigeon_newInstance'.", ""))));
                    break;
                } else {
                    List list29 = (List) obj;
                    if (list29.size() <= 1) {
                        fu7Var13.invoke(new Result(zy11Var));
                        break;
                    } else {
                        fu7Var13.invoke(new Result(new Result.Failure(new CameraXError((String) list29.get(0), (String) list29.get(1), (String) list29.get(2)))));
                        break;
                    }
                }
        }
    }
}
