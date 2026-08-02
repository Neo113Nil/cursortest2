package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.music.api.di.MusicBroadcastManagerComponent;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.h7u0;
import xsna.k840;

/* compiled from: BroadcastMusicDialog.kt */
/* loaded from: classes3.dex */
public final class lh8 {
    public final gxh a;
    public final u2b0 b = k840.a.g().b();

    public lh8(gxh gxhVar) {
        this.a = gxhVar;
    }

    public final void a(Activity activity) {
        ArrayList M = this.a.M();
        final mc40 M2 = ((MusicBroadcastManagerComponent) m7m.a(activity).mo408a(fpf0.a(MusicBroadcastManagerComponent.class))).M();
        List<UserId> b = M2.b();
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        ArrayList o = e43.o(context.getResources().getString(R.string.my_page));
        final ArrayList o2 = e43.o(o25.a().c());
        final ArrayList o3 = e43.o(Boolean.valueOf(b.contains(o25.a().c())));
        Iterator it = M.iterator();
        while (it.hasNext()) {
            Group group = (Group) it.next();
            o3.add(Boolean.valueOf(b.contains(fkq0.e(fkq0.a(group.c)))));
            o2.add(fkq0.e(fkq0.a(group.c)));
            o.add(group.d);
        }
        int i = h7u0.p;
        h7u0.a a = h7u0.b.a(activity);
        a.g0(R.string.audio_broadcast);
        a.V((CharSequence[]) o.toArray(new String[0]), j5g.J0(o3), new DialogInterface.OnMultiChoiceClickListener() { // from class: xsna.jh8
            @Override // android.content.DialogInterface.OnMultiChoiceClickListener
            public final void onClick(DialogInterface dialogInterface, int i2, boolean z) {
                o3.set(i2, Boolean.valueOf(z));
            }
        });
        a.c0(R.string.ok, new DialogInterface.OnClickListener() { // from class: xsna.kh8
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                ArrayList arrayList = new ArrayList();
                int i3 = 0;
                for (Object obj : o2) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        e43.t();
                        throw null;
                    }
                    if (((Boolean) o3.get(i3)).booleanValue()) {
                        arrayList.add(obj);
                    }
                    i3 = i4;
                }
                M2.a(this.b.b(), arrayList);
            }
        });
        a.W(R.string.cancel, null);
        a.m();
    }
}
