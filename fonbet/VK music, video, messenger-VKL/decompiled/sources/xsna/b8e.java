package xsna;

import com.vk.api.generated.audio.dto.AudioAudioDto;
import com.vk.api.generated.audio.dto.AudioGetResponseDto;
import com.vk.api.generated.friends.dto.FriendsSearchResponseDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.dto.music.Playlist;
import com.vk.dto.user.UserProfile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class b8e implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ b8e(int i, Playlist playlist) {
        this.b = 2;
        this.c = i;
        this.d = playlist;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                ((d8e) this.d).getRecycler().c(this.c, ((Boolean) obj).booleanValue());
                return s3q0.a;
            case 1:
                oa90 oa90Var = (oa90) this.d;
                int i = this.c;
                FriendsSearchResponseDto friendsSearchResponseDto = (FriendsSearchResponseDto) obj;
                List<UsersUserFullDto> d = friendsSearchResponseDto.d();
                j2r0 j2r0Var = oa90Var.k;
                ArrayList arrayList = new ArrayList(c5g.u(d, 10));
                for (UsersUserFullDto usersUserFullDto : d) {
                    j2r0Var.getClass();
                    arrayList.add(j2r0.a(usersUserFullDto));
                }
                ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new pqs((UserProfile) it.next()));
                }
                ArrayList arrayList3 = new ArrayList(arrayList2);
                int count = friendsSearchResponseDto.getCount();
                oa90Var.m = arrayList3.size() + oa90Var.m;
                oa90Var.l = oa90Var.m < count;
                if (!oa90Var.l && oa90Var.c) {
                    dts dtsVar = (dts) oa90Var.a(0, i - arrayList3.size()).a();
                    count += dtsVar.b;
                    List<nqs> list = dtsVar.a;
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj2 : list) {
                        if (!arrayList3.contains((nqs) obj2)) {
                            arrayList4.add(obj2);
                        }
                    }
                    if (!arrayList4.isEmpty()) {
                        arrayList3.add(oqs.a);
                    }
                    g5g.y(arrayList4, arrayList3);
                }
                return new dts(arrayList3, count, oa90Var.c);
            case 2:
                int i2 = this.c;
                Playlist playlist = (Playlist) this.d;
                AudioGetResponseDto audioGetResponseDto = (AudioGetResponseDto) obj;
                int count2 = audioGetResponseDto.getCount();
                List<AudioAudioDto> d2 = audioGetResponseDto.d();
                ArrayList arrayList5 = new ArrayList(c5g.u(d2, 10));
                Iterator<T> it2 = d2.iterator();
                while (it2.hasNext()) {
                    arrayList5.add(oc4.d((AudioAudioDto) it2.next()));
                }
                return new ta90(i2, i2 + 50, count2, playlist, arrayList5);
            default:
                uut0 uut0Var = (uut0) this.d;
                int i3 = this.c;
                uut0Var.g = true;
                if (i3 == 0) {
                    uut0Var.i.postDelayed(new j0(uut0Var.a, 17), 500L);
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ b8e(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }
}
