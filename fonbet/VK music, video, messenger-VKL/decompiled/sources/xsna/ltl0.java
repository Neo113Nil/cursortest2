package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.stories.dto.StoriesGetByIdExtendedResponseDto;
import com.vk.api.generated.stories.dto.StoriesStoryDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockPlaceholder;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionClearRecent;
import com.vk.core.serialize.Serializer;
import com.vk.dto.group.Group;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.user.UserProfile;
import com.vk.feed.design.view.newsfeed.header.VkFeedPostHeaderView;
import com.vk.libvideo.design.view.ad.VideoAdLayout;
import com.vk.video.ui.edit.fragments.VideoAlbumEditorFragment;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import one.video.ad.ux.motion.view.OneVideoMotionView;
import xsna.lyq0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class ltl0 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ ltl0(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i;
        boolean z = false;
        switch (this.b) {
            case 0:
                StoriesGetByIdExtendedResponseDto storiesGetByIdExtendedResponseDto = (StoriesGetByIdExtendedResponseDto) obj;
                k2r0 k2r0Var = new k2r0();
                new dqu();
                new j2r0();
                List<UsersUserFullDto> f = storiesGetByIdExtendedResponseDto.f();
                ArrayList arrayList = new ArrayList(c5g.u(f, 10));
                Iterator<T> it = f.iterator();
                while (it.hasNext()) {
                    arrayList.add(k2r0Var.a((UsersUserFullDto) it.next()));
                }
                List<GroupsGroupFullDto> d = storiesGetByIdExtendedResponseDto.d();
                ArrayList arrayList2 = new ArrayList(c5g.u(d, 10));
                Iterator<T> it2 = d.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(equ.a((GroupsGroupFullDto) it2.next()));
                }
                ArrayList u0 = j5g.u0(arrayList2, arrayList);
                HashMap hashMap = new HashMap(u0.size());
                Iterator it3 = u0.iterator();
                while (it3.hasNext()) {
                    Object next = it3.next();
                    hashMap.put(((Owner) next).b, next);
                }
                List<GroupsGroupFullDto> d2 = storiesGetByIdExtendedResponseDto.d();
                ArrayList arrayList3 = new ArrayList(c5g.u(d2, 10));
                Iterator<T> it4 = d2.iterator();
                while (it4.hasNext()) {
                    arrayList3.add(dqu.a((GroupsGroupFullDto) it4.next()));
                }
                HashMap hashMap2 = new HashMap(arrayList3.size());
                Iterator it5 = arrayList3.iterator();
                while (it5.hasNext()) {
                    Object next2 = it5.next();
                    hashMap2.put(((Group) next2).c, next2);
                }
                List<UsersUserFullDto> f2 = storiesGetByIdExtendedResponseDto.f();
                ArrayList arrayList4 = new ArrayList(c5g.u(f2, 10));
                Iterator<T> it6 = f2.iterator();
                while (it6.hasNext()) {
                    arrayList4.add(j2r0.a((UsersUserFullDto) it6.next()));
                }
                HashMap hashMap3 = new HashMap(arrayList4.size());
                Iterator it7 = arrayList4.iterator();
                while (it7.hasNext()) {
                    Object next3 = it7.next();
                    hashMap3.put(((UserProfile) next3).c, next3);
                }
                return ivl0.a((StoriesStoryDto) j5g.Y(storiesGetByIdExtendedResponseDto.e()), hashMap, hashMap3, hashMap2);
            case 1:
                qgi0.r((tgi0) obj, "alert_negative_button");
                return s3q0.a;
            case 2:
                String str = (String) obj;
                Serializer.c<UIBlockActionClearRecent> cVar = UIBlockActionClearRecent.CREATOR;
                return str;
            case 3:
                ((etv0) obj).b(false);
                return s3q0.a;
            case 4:
                int i2 = lyq0.a.$EnumSwitchMapping$1[((ryq0) obj).j.ordinal()];
                if (i2 == 1) {
                    i = R.string.user_recom_themes_save;
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = R.string.user_recom_themes_next;
                }
                return Integer.valueOf(i);
            case 5:
                ov70 ov70Var = (ov70) obj;
                return new tq2(Float.intBitsToFloat((int) (ov70Var.a >> 32)), Float.intBitsToFloat((int) (ov70Var.a & 4294967295L)));
            case 6:
                qcy<Object>[] qcyVarArr = VideoAdLayout.d;
                return Boolean.valueOf(!(((View) obj) instanceof OneVideoMotionView));
            case 7:
                int i3 = VideoAlbumEditorFragment.l0;
                qgi0.r((tgi0) obj, "edit_toolbar_title");
                return s3q0.a;
            case 8:
                ArrayList<UIBlock> arrayList5 = ((oyp0) obj).a.y;
                if (arrayList5 == null || !arrayList5.isEmpty()) {
                    Iterator<T> it8 = arrayList5.iterator();
                    while (true) {
                        if (it8.hasNext()) {
                            if (((UIBlock) it8.next()) instanceof UIBlockPlaceholder) {
                                z = true;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 9:
                return Integer.valueOf(((atp) obj).c);
            case 10:
                qgi0.r((tgi0) obj, "toolbar_menu");
                return s3q0.a;
            case 11:
                return new io.reactivex.rxjava3.internal.operators.observable.q(new tuz((View) obj, 22));
            case 12:
                return s3q0.a;
            case 13:
                int i4 = VkFeedPostHeaderView.S;
                return com.vk.movika.sdk.base.model.n.a(1.5f);
            case 14:
                ((vgg) obj).c();
                return s3q0.a;
            case 15:
                return ahn.C((io.reactivex.rxjava3.core.q) obj);
            default:
                return new iuw0((ViewGroup) obj);
        }
    }
}
