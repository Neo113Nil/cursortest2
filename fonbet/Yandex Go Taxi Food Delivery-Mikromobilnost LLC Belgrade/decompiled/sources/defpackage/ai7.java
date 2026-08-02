package defpackage;

import android.util.Log;
import android.webkit.ValueCallback;
import ru.yandex.taxi.web.calljsinterface.CallJsInterfaceApi;

/* loaded from: classes5.dex */
public final /* synthetic */ class ai7 implements ValueCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ ai7(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        int i = this.a;
        String str = this.b;
        String str2 = (String) obj;
        switch (i) {
            case 0:
                CallJsInterfaceApi.postEvaluateJavascript$lambda$0$0(str, str2);
                break;
            default:
                Log.e("CallJsInterface.response: ", str);
                break;
        }
    }
}
