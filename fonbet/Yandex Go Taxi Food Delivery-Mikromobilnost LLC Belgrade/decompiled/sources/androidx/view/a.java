package androidx.view;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import defpackage.i40;
import defpackage.jl40;
import defpackage.k550;
import defpackage.oa50;
import defpackage.oyr;
import defpackage.s2u0;
import defpackage.xfo;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/navigation/a;", "Landroidx/navigation/j;", "Li40;", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@oa50("activity")
/* loaded from: classes10.dex */
public class a extends j {
    public final Context c;
    public final Activity d;

    public a(Context context) {
        Object obj;
        this.c = context;
        Iterator it = kotlin.sequences.a.d(ActivityNavigator$hostActivity$1.w, context).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((Context) obj) instanceof Activity) {
                    break;
                }
            }
        }
        this.d = (Activity) obj;
    }

    @Override // androidx.view.j
    public final f a() {
        return new i40(this);
    }

    @Override // androidx.view.j
    public final f c(f fVar, Bundle bundle, k550 k550Var) {
        Intent intent;
        int intExtra;
        i40 i40Var = (i40) fVar;
        if (i40Var.E == null) {
            xfo.g(oyr.m(i40Var.A, " does not have an Intent set.", new StringBuilder("Destination ")));
            return null;
        }
        Intent intent2 = new Intent(i40Var.E);
        if (bundle != null) {
            intent2.putExtras(bundle);
            String str = i40Var.F;
            if (str != null && str.length() != 0) {
                StringBuffer stringBuffer = new StringBuffer();
                Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(str);
                while (matcher.find()) {
                    String group = matcher.group(1);
                    if (!bundle.containsKey(group)) {
                        s2u0.j("Could not find ", group, " in ", bundle, " to fill data pattern ", str);
                        return null;
                    }
                    matcher.appendReplacement(stringBuffer, "");
                    stringBuffer.append(Uri.encode(String.valueOf(bundle.get(group))));
                }
                matcher.appendTail(stringBuffer);
                intent2.setData(Uri.parse(stringBuffer.toString()));
            }
        }
        Activity activity = this.d;
        if (activity == null) {
            intent2.addFlags(SelfTester_JCP.IMITA);
        }
        if (k550Var != null && k550Var.a) {
            intent2.addFlags(536870912);
        }
        if (activity != null && (intent = activity.getIntent()) != null && (intExtra = intent.getIntExtra("android-support-navigation:ActivityNavigator:current", 0)) != 0) {
            intent2.putExtra("android-support-navigation:ActivityNavigator:source", intExtra);
        }
        intent2.putExtra("android-support-navigation:ActivityNavigator:current", i40Var.A);
        Context context = this.c;
        Resources resources = context.getResources();
        if (k550Var != null) {
            int i = k550Var.h;
            int i2 = k550Var.i;
            if ((i <= 0 || !jl40.l(resources.getResourceTypeName(i), "animator")) && (i2 <= 0 || !jl40.l(resources.getResourceTypeName(i2), "animator"))) {
                intent2.putExtra("android-support-navigation:ActivityNavigator:popEnterAnim", i);
                intent2.putExtra("android-support-navigation:ActivityNavigator:popExitAnim", i2);
            } else {
                resources.getResourceName(i);
                resources.getResourceName(i2);
                i40Var.toString();
            }
        }
        context.startActivity(intent2);
        if (k550Var != null && activity != null) {
            int i3 = k550Var.f;
            int i4 = k550Var.g;
            if ((i3 > 0 && jl40.l(resources.getResourceTypeName(i3), "animator")) || (i4 > 0 && jl40.l(resources.getResourceTypeName(i4), "animator"))) {
                resources.getResourceName(i3);
                resources.getResourceName(i4);
                i40Var.toString();
            } else if (i3 >= 0 || i4 >= 0) {
                if (i3 < 0) {
                    i3 = 0;
                }
                activity.overridePendingTransition(i3, i4 >= 0 ? i4 : 0);
            }
        }
        return null;
    }

    @Override // androidx.view.j
    public final boolean j() {
        Activity activity = this.d;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }
}
