package xsna;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import androidx.core.app.NotificationCompat;
import com.vk.dto.common.im.Image;
import com.vk.im.engine.models.contacts.Contact;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.EmptyList;

/* compiled from: NewContactsNotifierViaPush.kt */
/* loaded from: classes.dex */
public final class r660 implements q660 {
    public final Context a;
    public final mxv b;
    public final String c;
    public final int d;
    public final long e;
    public final AtomicReference<Collection<Contact>> f;

    public r660(Context context, mxv mxvVar) {
        long millis = TimeUnit.SECONDS.toMillis(5L);
        this.a = context;
        this.b = mxvVar;
        this.c = "default_ver2";
        this.d = 23484021;
        this.e = millis;
        this.f = new AtomicReference<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.q660
    public final void a(ArrayList arrayList) {
        Notification notification;
        this.f.set(arrayList);
        int size = arrayList.size();
        String str = this.c;
        mxv mxvVar = this.b;
        Context context = this.a;
        if (size > 1) {
            String f = enj.f(R.plurals.vkim_new_contacts_notfy_title, arrayList.size(), context);
            String string = context.getString(R.string.vkim_new_contacts_notfy_description);
            mxvVar.getClass();
            PendingIntent a = t2i0.a(context, 0, k9u0.a.j(context), 301989888);
            NotificationCompat.h hVar = new NotificationCompat.h(context, str);
            hVar.z(R.drawable.vk_icon_new_logo_vk_24);
            hVar.k(f);
            hVar.j(string);
            hVar.i(a);
            hVar.v(0);
            hVar.e(true);
            notification = hVar.c();
        } else {
            Bitmap bitmap = null;
            if (arrayList.size() == 1) {
                Contact contact = (Contact) j5g.X(arrayList);
                String format = String.format(context.getString(R.string.vkim_new_contact_notify_title), Arrays.copyOf(new Object[]{contact.B3()}, 1));
                String format2 = String.format(context.getString(R.string.vkim_new_contact_notify_description), Arrays.copyOf(new Object[]{contact.B3()}, 1));
                int a2 = iah0.a(64);
                Image Bb = contact.C8().Bb(a2, a2);
                String url = Bb != null ? Bb.getUrl() : null;
                if (url != null && url.length() != 0) {
                    try {
                        bitmap = (Bitmap) mcr0.l(-1L, url).y0(this.e, TimeUnit.MILLISECONDS).a();
                    } catch (Throwable unused) {
                    }
                }
                PendingIntent a3 = t2i0.a(context, 0, o0w.j(mxvVar.b(), this.a, null, contact.G3(), new DialogExt(contact), null, "message_new_contact_push", mxvVar.b().D(), null, 100638706), 301989888);
                NotificationCompat.h hVar2 = new NotificationCompat.h(context, str);
                hVar2.z(R.drawable.vk_icon_new_logo_vk_24);
                hVar2.q(bitmap);
                hVar2.k(format);
                hVar2.j(format2);
                hVar2.i(a3);
                hVar2.v(0);
                hVar2.e(true);
                notification = hVar2.c();
            } else {
                notification = null;
            }
        }
        if (notification != null) {
            new dd70(context).a(notification, this.d);
        }
    }

    @Override // xsna.q660
    public final void b(Collection<Contact> collection) {
        Collection<Contact> collection2 = this.f.get();
        if (collection2.size() == 1 && p4g.b(collection2, collection)) {
            c();
        }
    }

    @Override // xsna.q660
    public final void c() {
        this.f.set(EmptyList.b);
        new dd70(this.a).b.cancel(null, this.d);
    }
}
