package xsna;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.vk.bridges.CompanionApp;
import com.vk.companion.receiver.AccountInfoBroadcastReceiver;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: CompanionEventPublisherImpl.kt */
/* loaded from: classes.dex */
public final class o6i {
    public final Context a;
    public final ArrayList b;
    public final CompanionApp c;

    public o6i(Context context, ArrayList arrayList, CompanionApp companionApp) {
        this.a = context;
        this.b = arrayList;
        this.c = companionApp;
    }

    public static final void a(o6i o6iVar, String str) {
        Intent intent = new Intent(str);
        String str2 = k6i.a;
        Context context = o6iVar.a;
        intent.putExtra("com.vk.im.SENDER_PACKAGE", context.getPackageName());
        context.sendBroadcast(intent, com.vk.core.apps.a.a());
    }

    public final void b(Context context, String str) {
        ArrayList arrayList = this.b;
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new ComponentName((String) it.next(), AccountInfoBroadcastReceiver.class.getName()));
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            ComponentName componentName = (ComponentName) it2.next();
            Intent intent = new Intent();
            intent.setComponent(componentName);
            intent.setAction(str);
            context.sendBroadcast(intent);
        }
    }
}
