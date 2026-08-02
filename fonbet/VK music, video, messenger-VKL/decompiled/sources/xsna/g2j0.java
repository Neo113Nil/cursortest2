package xsna;

import android.content.Context;
import android.util.SparseArray;
import androidx.fragment.app.FragmentActivity;
import com.vk.dto.common.data.VKList;
import com.vk.dto.music.AlbumLink;
import com.vk.dto.music.MusicTrack;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.h7u0;

/* compiled from: SettingsGeneralFragment.java */
/* loaded from: classes7.dex */
public final class g2j0 extends rpj0<VKList<MusicTrack>> {
    public final /* synthetic */ Context d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2j0(FragmentActivity fragmentActivity, FragmentActivity fragmentActivity2) {
        super(fragmentActivity);
        this.d = fragmentActivity2;
    }

    @Override // xsna.hx2
    public final void b(Object obj) {
        VKList vKList = (VKList) obj;
        SparseArray sparseArray = new SparseArray();
        Iterator<T> it = vKList.iterator();
        while (it.hasNext()) {
            MusicTrack musicTrack = (MusicTrack) it.next();
            AlbumLink albumLink = musicTrack.q;
            if ((albumLink != null ? albumLink.b : 0) != 0) {
                ArrayList arrayList = (ArrayList) sparseArray.get(albumLink != null ? albumLink.b : 0);
                if (arrayList == null) {
                    AlbumLink albumLink2 = musicTrack.q;
                    int i = albumLink2 != null ? albumLink2.b : 0;
                    arrayList = new ArrayList();
                    sparseArray.put(i, arrayList);
                }
                arrayList.add(musicTrack);
            }
        }
        Object[] objArr = {Integer.valueOf(vKList.size())};
        Context context = this.d;
        String[] strArr = {context.getString(R.string.all_music, objArr)};
        h7u0.a aVar = new h7u0.a(context);
        aVar.g0(R.string.select_list_for_save);
        aVar.T(strArr, new o1c());
        aVar.m();
    }
}
