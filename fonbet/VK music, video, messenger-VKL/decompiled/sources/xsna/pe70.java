package xsna;

import android.content.Context;
import com.vk.api.generated.notifications.dto.NotificationsEditRedesignPushSettingResponseDto;
import com.vk.api.generated.notifications.dto.NotificationsNotificationSettingRedesignDto;
import com.vk.api.generated.users.dto.UsersTabCollectionDto;
import com.vk.api.generated.users.dto.UsersTabSpecialValuesDto;
import com.vk.clips.sdk.shared.api.playlist.ClipsPlaylist;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.VideoFileOld;
import com.vk.dto.common.data.VKList;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import com.vk.profile.core.tabs.ui.clips.Clips;
import com.vk.profile.user.impl.ui.b;
import com.vk.pushes.NotificationUtils;
import com.vkontakte.android.api.ExtendedUserProfile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import xsna.cf70;
import xsna.cvd0;
import xsna.e6w0;
import xsna.p7w0;
import xsna.vzi0;
import xsna.ymq0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class pe70 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ pe70(Object obj, Object obj2, boolean z, int i) {
        this.b = i;
        this.d = obj;
        this.e = obj2;
        this.c = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ArrayList arrayList;
        ArrayList arrayList2;
        Clips.ContentTabCollection contentTabCollection;
        UsersTabSpecialValuesDto usersTabSpecialValuesDto;
        Object obj2;
        List<UsersTabCollectionDto> list;
        int i = this.b;
        Object obj3 = this.e;
        boolean z = this.c;
        Object obj4 = this.d;
        switch (i) {
            case 0:
                qe70 qe70Var = (qe70) obj4;
                f4z f4zVar = qe70Var.o;
                jf70 jf70Var = (jf70) obj3;
                NotificationsNotificationSettingRedesignDto d = ((NotificationsEditRedesignPushSettingResponseDto) obj).d();
                if (d != null) {
                    f4zVar.b(vzi0.c.a);
                    qe70Var.T(new cf70.g(d));
                    Context context = e43.a;
                    NotificationUtils.m(context != null ? context : null, NotificationUtils.Type.b(jf70Var.d), z);
                } else {
                    f4zVar.b(vzi0.a.a);
                }
                return s3q0.a;
            case 1:
                ymq0 ymq0Var = (ymq0) obj4;
                Clips clips = (Clips) obj3;
                ymq0.a aVar = (ymq0.a) obj;
                r0e0 r0e0Var = ymq0Var.c;
                VKList<VideoFile> vKList = aVar.a;
                gud gudVar = aVar.c;
                VKList<ClipsPlaylist> vKList2 = aVar.b;
                if (vKList2 != null) {
                    arrayList = new ArrayList();
                    for (ClipsPlaylist clipsPlaylist : vKList2) {
                        if (clipsPlaylist.e != 0) {
                            arrayList.add(clipsPlaylist);
                        }
                    }
                } else {
                    arrayList = null;
                }
                int i2 = dnq0.a;
                VideoFileOld c = dnq0.c(gudVar, r0e0Var.a());
                List<ExtendedUserProfile.m> list2 = aVar.d;
                if (list2 != null) {
                    for (ExtendedUserProfile.m mVar : list2) {
                        if (mVar.a.equals("short_videos")) {
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                mVar = null;
                if (mVar == null || (list = mVar.g) == null) {
                    arrayList2 = null;
                } else {
                    List<UsersTabCollectionDto> list3 = list;
                    arrayList2 = new ArrayList(c5g.u(list3, 10));
                    Iterator<T> it = list3.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(Clips.a.b((UsersTabCollectionDto) it.next()));
                    }
                }
                int i3 = dnq0.a;
                if (arrayList2 != null) {
                    Iterator it2 = arrayList2.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj2 = it2.next();
                            if (((Clips.ContentTabCollection) obj2).a == Clips.ContentTabCollection.ContentTabCollectionType.SCHEDULED) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    contentTabCollection = (Clips.ContentTabCollection) obj2;
                } else {
                    contentTabCollection = null;
                }
                VideoFileOld d2 = dnq0.d(contentTabCollection);
                VKList<VideoFile> vKList3 = aVar.a;
                VideoFileOld c2 = dnq0.c(gudVar, r0e0Var.a());
                if (z && ((vKList3 == null || vKList3.isEmpty()) && d2 == null && c2 == null)) {
                    wmq0.B(ymq0Var, clips, CommunityProfileContentItem.State.EMPTY, null, 4);
                    ymq0Var.p = clips;
                } else {
                    Integer d3 = (mVar == null || (usersTabSpecialValuesDto = mVar.h) == null) ? null : usersTabSpecialValuesDto.d();
                    ArrayList arrayList3 = arrayList;
                    Clips i4 = Clips.i(clips, null, null, null, null, false, false, null, null, null, null, null, null, false, 524287);
                    if (vKList != null) {
                        ArrayList arrayList4 = new ArrayList();
                        cvd0.f fVar = clips.j;
                        if (fVar != null) {
                            arrayList4.addAll(fVar.a);
                        }
                        arrayList4.addAll(vKList);
                        i4 = Clips.i(clips, new cvd0.f(arrayList4), null, null, null, myc0.f(vKList.j()) && !vKList.isEmpty(), false, vKList.j(), null, z ? CommunityProfileContentItem.State.LOADED : clips.s, z ? clips.u : CommunityProfileContentItem.State.LOADED, null, null, false, 259502);
                    }
                    if (arrayList3 != null) {
                        i4 = dnq0.b(i4, arrayList3, vKList2.j(), z);
                    }
                    if (z) {
                        i4 = ymq0.E(i4);
                    }
                    if (d2 != null) {
                        i4 = dnq0.a(i4, d2);
                    }
                    if (c != null) {
                        i4 = dnq0.a(i4, c);
                    }
                    Clips clips2 = i4;
                    izs<? super com.vk.profile.user.impl.ui.b, s3q0> izsVar = ymq0Var.h;
                    (izsVar != null ? izsVar : null).invoke(new b.c(Clips.i(clips2, null, null, null, null, false, false, null, null, null, null, null, d3, false, 458751)));
                    ymq0Var.p = clips2;
                }
                return s3q0.a;
            default:
                m6w0 m6w0Var = (m6w0) obj4;
                e6w0.k kVar = (e6w0.k) obj3;
                if (((Boolean) obj).booleanValue()) {
                    m6w0Var.T(z ? new p7w0.b(kVar.b) : new p7w0.i(kVar.b));
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ pe70(m6w0 m6w0Var, boolean z, e6w0.k kVar) {
        this.b = 2;
        this.d = m6w0Var;
        this.c = z;
        this.e = kVar;
    }
}
