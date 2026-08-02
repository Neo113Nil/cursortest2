package xsna;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* compiled from: AnimatablePathValue.java */
/* loaded from: classes12.dex */
public final class sf2 implements fg2 {
    public Object b;

    public /* synthetic */ sf2(Object obj) {
        this.b = obj;
    }

    public xah0 a() {
        Resources system;
        Resources resources;
        Configuration configuration;
        Context context = (Context) this.b;
        if (context == null || (system = context.getResources()) == null) {
            system = Resources.getSystem();
        }
        float f = system.getDisplayMetrics().density;
        Context context2 = (Context) this.b;
        boolean z = false;
        int i = (context2 == null || (resources = context2.getResources()) == null || (configuration = resources.getConfiguration()) == null) ? 0 : configuration.screenWidthDp;
        Context context3 = (Context) this.b;
        if (context3 != null) {
            HashSet hashSet = iah0.a;
            z = fnj.b(context3);
        }
        return new xah0(f, i, z);
    }

    public String b() {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        return new cwi(context).a((Uri) this.b);
    }

    @Override // xsna.fg2
    public boolean d() {
        ArrayList arrayList = (ArrayList) this.b;
        return arrayList.size() == 1 && ((nhy) arrayList.get(0)).c();
    }

    @Override // xsna.fg2
    public tf6 j() {
        ArrayList arrayList = (ArrayList) this.b;
        return ((nhy) arrayList.get(0)).c() ? new llb0(arrayList) : new nq90(arrayList);
    }

    @Override // xsna.fg2
    public List l() {
        return (ArrayList) this.b;
    }

    public sf2(String str) {
        this.b = Uri.parse(str);
    }

    public sf2() {
    }
}
