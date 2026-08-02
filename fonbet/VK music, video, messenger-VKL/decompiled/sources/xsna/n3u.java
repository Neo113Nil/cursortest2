package xsna;

import android.content.Context;
import android.content.DialogInterface;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.d;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* compiled from: GoToSettingDialog.kt */
/* loaded from: classes4.dex */
public final class n3u {
    public static final Object a;

    static {
        Pair pair = new Pair("android.permission.CAMERA", Integer.valueOf(R.string.vk_permissions_go_to_settings_camera));
        Pair pair2 = new Pair("android.permission.RECORD_AUDIO", Integer.valueOf(R.string.vk_permissions_go_to_settings_michrophone));
        Integer valueOf = Integer.valueOf(R.string.vk_permissions_go_to_settings_files_and_media);
        Pair pair3 = new Pair("android.permission.READ_EXTERNAL_STORAGE", valueOf);
        Pair pair4 = new Pair("android.permission.WRITE_EXTERNAL_STORAGE", valueOf);
        Pair pair5 = new Pair("android.permission.READ_MEDIA_VIDEO", Integer.valueOf(R.string.vk_permissions_go_to_settings_video));
        Pair pair6 = new Pair("android.permission.READ_MEDIA_IMAGES", Integer.valueOf(R.string.vk_permissions_go_to_settings_photo));
        Integer valueOf2 = Integer.valueOf(R.string.vk_permissions_go_to_settings_location);
        Pair pair7 = new Pair("android.permission.ACCESS_MEDIA_LOCATION", valueOf2);
        Pair pair8 = new Pair("android.permission.ACCESS_COARSE_LOCATION", valueOf2);
        Pair pair9 = new Pair("android.permission.ACCESS_FINE_LOCATION", valueOf2);
        Integer valueOf3 = Integer.valueOf(R.string.vk_permissions_go_to_settings_contacts);
        Pair pair10 = new Pair("android.permission.READ_CONTACTS", valueOf3);
        Pair pair11 = new Pair("android.permission.WRITE_CONTACTS", valueOf3);
        Integer valueOf4 = Integer.valueOf(R.string.vk_permissions_go_to_settings_calendar);
        Pair pair12 = new Pair("android.permission.WRITE_CALENDAR", valueOf4);
        Pair pair13 = new Pair("android.permission.READ_CALENDAR", valueOf4);
        Integer valueOf5 = Integer.valueOf(R.string.vk_permissions_go_to_settings_call_history);
        a = pn00.k(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, pair11, pair12, pair13, new Pair("android.permission.READ_CALL_LOG", valueOf5), new Pair("android.permission.WRITE_CALL_LOG", valueOf5), new Pair("android.permission.READ_PHONE_STATE", Integer.valueOf(R.string.vk_permissions_go_to_settings_telephone)), new Pair("android.permission.ACTIVITY_RECOGNITION", Integer.valueOf(R.string.vk_permissions_go_to_settings_activity_recognition)), new Pair("android.permission.POST_NOTIFICATIONS", Integer.valueOf(R.string.vk_permissions_go_to_settings_notifications)), new Pair("android.permission.BLUETOOTH_CONNECT", Integer.valueOf(R.string.vk_permissions_go_to_settings_bluetooth_connect)));
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.Map] */
    public static final androidx.appcompat.app.d a(Context context, ArrayList arrayList, final gzs gzsVar, final gzs gzsVar2) {
        d.a aVar = new d.a(context);
        AlertController.b bVar = aVar.a;
        bVar.m = false;
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((Integer) a.get((String) it.next()));
        }
        List V = j5g.V(j5g.S0(arrayList2));
        ArrayList arrayList3 = new ArrayList(c5g.u(V, 10));
        Iterator it2 = V.iterator();
        while (it2.hasNext()) {
            arrayList3.add(context.getString(((Number) it2.next()).intValue()));
        }
        bVar.f = arrayList3.isEmpty() ? context.getString(R.string.vk_permissions_go_to_settings_empty) : arrayList3.size() == 1 ? context.getString(R.string.vk_permissions_go_to_settings_one, j5g.Y(arrayList3)) : context.getString(R.string.vk_permissions_go_to_settings_many, j5g.g0(arrayList3, context.getString(R.string.vk_permissions_go_to_settings_separator), null, null, 0, null, 62));
        aVar.j(context.getString(R.string.vk_permissions_go_to_settings_positive), new DialogInterface.OnClickListener() { // from class: xsna.l3u
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                gzs.this.invoke();
            }
        });
        aVar.f(context.getString(R.string.vk_permissions_go_to_settings_negative), new DialogInterface.OnClickListener() { // from class: xsna.m3u
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                gzs.this.invoke();
            }
        });
        return aVar.create();
    }
}
