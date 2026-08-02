package defpackage;

import android.content.Context;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.b;
import com.ybsdk.core.utils.text.c;

/* loaded from: classes2.dex */
public abstract class hde {
    public static final gza0 a(Context context) {
        String str;
        c0b0 c0b0Var = new c0b0("android.permission.READ_CONTACTS");
        z8i0 z8i0Var = new z8i0(unr0.h(Text.Companion, dzh0.ybsdk_transfer_contacts_access_required_title), new Text.Resource(dzh0.ybsdk_transfer_contacts_rationale_description), new Text.Resource(dzh0.ybsdk_transfer_contacts_rationale_accept), new Text.Resource(dzh0.ybsdk_transfer_contacts_rationale_reject), new nbv(txg0.ybsdk_permission_contacts, null), null, 32);
        Text.Resource resource = new Text.Resource(dzh0.ybsdk_transfer_contacts_access_required_title);
        int i = dzh0.ybsdk_transfer_access_to_contacts_description_template;
        c cVar = Text.Formatted.Arg.Companion;
        try {
            str = context.getPackageManager().getApplicationLabel(context.getPackageManager().getApplicationInfo(context.getPackageName(), 0)).toString();
        } catch (Throwable unused) {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        cVar.getClass();
        return new gza0(c0b0Var, z8i0Var, new wrt(resource, b.b(i, new Text.Formatted.Arg.StringArg(str)), new Text.Resource(dzh0.ybsdk_transfer_open_settings_title), new nbv(txg0.ybsdk_permission_contacts, null)), 8);
    }
}
