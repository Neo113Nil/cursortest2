package xsna;

import com.ironsource.Z3;
import com.vk.api.generated.friends.dto.FriendsFriendsListDto;
import com.vk.api.generated.friends.dto.FriendsGetListsResponseDto;
import com.vk.dto.common.VideoFile;
import com.vk.video.ui.upload.impl.attachedclips.presentation.feature.entity.AttachedClipsState;
import java.util.List;
import xsna.dwv0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class i54 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ List c;

    public /* synthetic */ i54(List list, int i) {
        this.b = i;
        this.c = list;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                AttachedClipsState attachedClipsState = (AttachedClipsState) obj;
                List<VideoFile> list = attachedClipsState.e;
                List<VideoFile> list2 = this.c;
                return AttachedClipsState.a(attachedClipsState, list2, null, null, list == null ? list2 : list, null, false, false, false, false, null, Z3.j);
            case 1:
                return this.c.get(((Integer) obj).intValue());
            default:
                List<FriendsFriendsListDto> d = ((FriendsGetListsResponseDto) obj).d();
                int size = d.size();
                String[] strArr = new String[size];
                for (int i = 0; i < size; i++) {
                    strArr[i] = null;
                }
                int size2 = d.size();
                boolean[] zArr = new boolean[size2];
                for (int i2 = 0; i2 < size2; i2++) {
                    zArr[i2] = false;
                }
                int size3 = d.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    strArr[i3] = d.get(i3).d();
                    zArr[i3] = this.c.contains(Long.valueOf(d.get(i3).getId()));
                }
                return new dwv0.b(strArr, zArr, d);
        }
    }
}
