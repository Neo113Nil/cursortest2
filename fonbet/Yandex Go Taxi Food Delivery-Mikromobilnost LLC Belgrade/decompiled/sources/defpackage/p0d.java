package defpackage;

import androidx.activity.ComponentActivity;
import androidx.fragment.app.FragmentActivity;
import ru.yandex.taxi.activity.MainActivity;

/* loaded from: classes.dex */
public final /* synthetic */ class p0d implements cy60 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ComponentActivity b;

    public /* synthetic */ p0d(ComponentActivity componentActivity, int i) {
        this.a = i;
        this.b = componentActivity;
    }

    @Override // defpackage.cy60
    public final void a(ComponentActivity componentActivity) {
        int i = this.a;
        ComponentActivity componentActivity2 = this.b;
        switch (i) {
            case 0:
                ComponentActivity._init_$lambda$4(componentActivity2, componentActivity);
                break;
            case 1:
                ((FragmentActivity) componentActivity2).lambda$init$3(componentActivity);
                break;
            default:
                MainActivity._init_$lambda$0((MainActivity) componentActivity2, componentActivity);
                break;
        }
    }
}
