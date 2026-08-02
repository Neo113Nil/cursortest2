package xsna;

import android.app.Activity;
import android.view.View;
import com.vk.api.generated.board.dto.BoardTopicDto;
import com.vk.api.generated.groups.dto.GroupsGetContentForTabsResponseDto;
import com.vk.api.generated.groups.dto.GroupsTabContentDiscussionsDto;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.libvideo.ui.VideoBottomBarView;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class rc implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ rc(Object obj, Object obj2, boolean z, int i) {
        this.b = i;
        this.d = obj;
        this.e = obj2;
        this.c = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        boolean z = this.c;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (i) {
            case 0:
                uc ucVar = (uc) obj3;
                Activity activity = (Activity) obj2;
                VideoFile videoFile = (VideoFile) obj;
                if (videoFile != null) {
                    ucVar.v(videoFile);
                }
                uc.r(ucVar, activity, this.c, null, null, null, null, 252);
                break;
            case 1:
                chh chhVar = (chh) obj3;
                tan tanVar = (tan) obj2;
                GroupsGetContentForTabsResponseDto groupsGetContentForTabsResponseDto = (GroupsGetContentForTabsResponseDto) obj;
                GroupsTabContentDiscussionsDto g = groupsGetContentForTabsResponseDto.g();
                List<BoardTopicDto> d = g != null ? g.d() : null;
                if (d == null) {
                    d = EmptyList.b;
                }
                if (z && d.isEmpty()) {
                    chh.v(chhVar, tanVar, CommunityProfileContentItem.State.EMPTY, null, 4);
                } else {
                    Collection collection = tanVar.j;
                    if (collection == null) {
                        collection = EmptyList.b;
                    }
                    Collection collection2 = collection;
                    List<BoardTopicDto> list = d;
                    ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                    for (BoardTopicDto boardTopicDto : list) {
                        ii7 ii7Var = new ii7(0);
                        Integer g2 = boardTopicDto.g();
                        if (g2 != null) {
                            ii7Var.a = g2.intValue();
                        }
                        String title = boardTopicDto.getTitle();
                        if (title != null) {
                            ii7Var.b = title;
                        }
                        Integer d2 = boardTopicDto.d();
                        if (d2 != null) {
                            ii7Var.c = d2.intValue();
                        }
                        Integer e = boardTopicDto.e();
                        if (e != null) {
                            ii7Var.d = e.intValue();
                        }
                        Integer j = boardTopicDto.j();
                        if (j != null) {
                            ii7Var.e = j.intValue();
                        }
                        UserId f = boardTopicDto.f();
                        if (f != null) {
                            ii7Var.h = f;
                        }
                        arrayList.add(ii7Var);
                    }
                    ArrayList u0 = j5g.u0(arrayList, collection2);
                    GroupsTabContentDiscussionsDto g3 = groupsGetContentForTabsResponseDto.g();
                    boolean f2 = myc0.f(g3 != null ? g3.e() : null);
                    CommunityProfileContentItem.State state = z ? CommunityProfileContentItem.State.LOADED : tanVar.o;
                    CommunityProfileContentItem.State state2 = z ? tanVar.q : CommunityProfileContentItem.State.LOADED;
                    GroupsTabContentDiscussionsDto g4 = groupsGetContentForTabsResponseDto.g();
                    chhVar.q(tan.i(tanVar, u0, f2, g4 != null ? g4.e() : null, state, state2, 88));
                }
                break;
            default:
                VideoBottomBarView videoBottomBarView = (VideoBottomBarView) obj3;
                VideoFile videoFile2 = (VideoFile) obj2;
                View view = (View) obj;
                if (!z) {
                    int i2 = VideoBottomBarView.p;
                    if (o25.a().b()) {
                        Set<View> set = g6z.a;
                        g6z.c(videoBottomBarView.d, videoBottomBarView.f, !videoFile2.O9(), true, 48);
                    }
                }
                View.OnClickListener onClickListener = videoBottomBarView.m;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ rc(boolean z, VideoBottomBarView videoBottomBarView, VideoFile videoFile) {
        this.b = 2;
        this.c = z;
        this.d = videoBottomBarView;
        this.e = videoFile;
    }
}
