package defpackage;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class o0d implements f2m0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o0d(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.f2m0
    public final Bundle a() {
        Bundle _init_$lambda$3;
        Bundle lambda$init$0;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                _init_$lambda$3 = ComponentActivity._init_$lambda$3((ComponentActivity) obj);
                return _init_$lambda$3;
            case 1:
                Map a = ((m1m0) obj).a();
                Bundle bundle = new Bundle();
                for (Map.Entry entry : a.entrySet()) {
                    String str = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    bundle.putParcelableArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
                }
                return bundle;
            case 2:
                lambda$init$0 = ((FragmentActivity) obj).lambda$init$0();
                return lambda$init$0;
            default:
                return ((FragmentManager) obj).h0();
        }
    }
}
