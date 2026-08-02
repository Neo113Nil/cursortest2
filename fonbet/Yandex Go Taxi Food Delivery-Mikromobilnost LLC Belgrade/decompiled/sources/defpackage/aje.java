package defpackage;

import android.net.Uri;
import ru.yandex.taxi.eatskit.ContentView;

/* loaded from: classes5.dex */
public final /* synthetic */ class aje implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ rme b;

    public /* synthetic */ aje(rme rmeVar, int i) {
        this.a = i;
        this.b = rmeVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 init$lambda$3;
        zy11 init$lambda$4;
        zy11 init$lambda$5;
        int i = this.a;
        rme rmeVar = this.b;
        switch (i) {
            case 0:
                init$lambda$3 = ContentView.init$lambda$3(rmeVar);
                return init$lambda$3;
            case 1:
                init$lambda$4 = ContentView.init$lambda$4(rmeVar);
                return init$lambda$4;
            case 2:
                init$lambda$5 = ContentView.init$lambda$5(rmeVar);
                return init$lambda$5;
            case 3:
                ien l = ((rnc) rmeVar.b.a).l();
                if (l == null) {
                    return null;
                }
                l.setJavaScriptEnabled(true);
                l.setDomStorageEnabled(true);
                l.setDatabaseEnabled(true);
                l.setMediaPlaybackRequiresUserGesture(false);
                rmeVar.b();
                l.addJavascriptInterface(rmeVar.f(), "taxiApp");
                rmeVar.d = l.getUserAgentString();
                l.setClient(new yfa(rmeVar));
                return l;
            default:
                Uri.Builder a = rmeVar.a();
                rmeVar.j(a, rmeVar.i);
                return a.build();
        }
    }
}
