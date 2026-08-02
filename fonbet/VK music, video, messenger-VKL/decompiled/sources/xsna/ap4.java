package xsna;

import androidx.annotation.NonNull;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.Section;
import com.vk.dto.user.UserProfile;
import com.vk.log.L;
import java.util.ArrayList;
import org.json.JSONObject;
import xsna.aay;

/* compiled from: AudioGetCatalogBlockById.java */
/* loaded from: classes14.dex */
public final class ap4 extends rsg0<com.vk.dto.music.a> {
    @Override // xsna.oer0, xsna.k7r0
    public final Object a(@NonNull JSONObject jSONObject) throws Exception, VKApiExecutionException {
        try {
            Section section = new Section(jSONObject.getJSONObject("response").getJSONObject("block"));
            VKList vKList = new VKList();
            vKList.o(section.g);
            if (section.h != null) {
                UserId c = vx2.d.c();
                ArrayList<Playlist> arrayList = section.h;
                ArrayList a = aay.a.a(jSONObject.getJSONObject("response"), "profiles", UserProfile.g0);
                ArrayList a2 = aay.a.a(jSONObject.getJSONObject("response"), "groups", Group.z0);
                dlv dlvVar = new dlv();
                dlvVar.b(a);
                dlvVar.a(a2);
                dlvVar.d(c, arrayList);
                vKList.addAll(section.h);
            }
            vKList.n(section.n);
            return new com.vk.dto.music.a(vKList, null);
        } catch (Exception e) {
            L.i(e);
            return null;
        }
    }
}
