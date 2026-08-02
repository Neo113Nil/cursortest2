package xsna;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.vk.api.generated.video.dto.VideoGetCommentsExtendedResponseDto;
import com.vk.dto.common.id.UserId;
import com.vk.dto.shortvideo.ClipGridParams;
import com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.MsgPartGroupCallHolderItem;
import com.vk.mediapicker.impl.presentation.mvi.MediaPickerMviState;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vk.newsfeed.api.data.NewsComment;
import com.vk.newsfeed.api.data.VideoStatistic;
import com.vk.newsfeed.posting.impl.domain.model.MediaViewerOpenPoint;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.fmc0;
import xsna.x020;
import xsna.zlh0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class o15 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ o15(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        fmc0 aVar;
        Object obj2;
        int i = this.b;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                ((p15) obj5).b((UserId) obj4, (UserId) obj3);
                return s3q0.a;
            case 1:
                String str = (String) obj5;
                String str2 = (String) obj4;
                String str3 = (String) obj3;
                qyg0 V0 = ((hyg0) obj).V0("UPDATE auto_download_track SET manifest_url = ? WHERE uid = ? AND mid = ?");
                try {
                    V0.D3(1, str);
                    V0.D3(2, str2);
                    V0.D3(3, str3);
                    V0.step();
                    V0.close();
                    return s3q0.a;
                } catch (Throwable th) {
                    V0.close();
                    throw th;
                }
            case 2:
                return (NewsComment) j5g.Y(fae.b(((eae) obj5).a, (VideoGetCommentsExtendedResponseDto) obj, (UserId) obj4, (VideoStatistic) obj3, false, 56).a);
            case 3:
                MediaPickerMviState.Medias.Loaded loaded = (MediaPickerMviState.Medias.Loaded) obj5;
                rv10 rv10Var = (rv10) obj4;
                MediaPickerMviState mediaPickerMviState = (MediaPickerMviState) obj;
                ArrayList u0 = j5g.u0(rv10Var.a, loaded.c);
                ArrayList u02 = j5g.u0(rv10Var.b, loaded.d);
                List<MediaStoreEntry> list = rv10Var.a;
                ((com.vk.mediapicker.impl.presentation.mvi.b) obj3).getClass();
                return MediaPickerMviState.a(mediaPickerMviState, 0, null, false, null, MediaPickerMviState.Medias.Loaded.a(loaded, u0, u02, (list.isEmpty() || list.size() < 100) ? MediaPickerMviState.Pagination.NoMoreData : MediaPickerMviState.Pagination.Loaded, 1), 31);
            case 4:
                x020 x020Var = (x020) obj5;
                ArrayList arrayList = (ArrayList) obj3;
                int intValue = ((Integer) obj).intValue();
                int i2 = x020.a.$EnumSwitchMapping$0[((MediaViewerOpenPoint) obj4).ordinal()];
                if (i2 == 1) {
                    aVar = new fmc0.i.a(intValue);
                } else if (i2 == 2) {
                    aVar = new fmc0.i.e(intValue);
                } else if (i2 == 3) {
                    aVar = new fmc0.i.d(intValue);
                } else {
                    if (i2 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar = new fmc0.i.c(intValue);
                }
                efc0 feature = x020Var.a.getFeature();
                if (feature != null) {
                    feature.j0(aVar);
                }
                x020Var.j = (MediaStoreEntry) j5g.b0(intValue, arrayList);
                return s3q0.a;
            case 5:
                String str4 = (String) obj4;
                MsgPartGroupCallHolderItem msgPartGroupCallHolderItem = (MsgPartGroupCallHolderItem) obj3;
                pk30 pk30Var = ((er30) obj5).j;
                if (pk30Var != null) {
                    String str5 = msgPartGroupCallHolderItem.g;
                    msgPartGroupCallHolderItem.h.size();
                    pk30Var.v(new biu(str4, str5));
                }
                return s3q0.a;
            case 6:
                List list2 = (List) obj5;
                UserId userId = (UserId) obj4;
                abe0 abe0Var = (abe0) obj3;
                if (((Boolean) obj).booleanValue()) {
                    Iterator it = list2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj2 = it.next();
                            if (((ClipGridParams.Data.Profile) obj2).b.b.b.b == userId.b) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    if (((ClipGridParams.Data.Profile) obj2) != null) {
                        wye wyeVar = abe0Var.d;
                        ViewGroup viewGroup = abe0Var.c;
                        abe0Var.f = wyeVar.d(viewGroup.getContext(), new r4(abe0Var, 8));
                        qcy<Object>[] qcyVarArr = bwt0.a;
                        int dimension = (int) viewGroup.getResources().getDimension(R.dimen.clips_grid_publication_banner_hor_margin);
                        CoordinatorLayout.f fVar = new CoordinatorLayout.f(-2, -2);
                        fVar.setMargins(dimension, 0, dimension, (abe0Var.b.U1() && tyx.a().getExperiments().c()) ? ((int) viewGroup.getResources().getDimension(R.dimen.clips_grid_publication_banner_bottom_margin)) + ((int) viewGroup.getResources().getDimension(R.dimen.clips_grid_camera_btn_height)) : (int) viewGroup.getResources().getDimension(R.dimen.clips_grid_publication_banner_bottom_margin));
                        fVar.c = 81;
                        View view = abe0Var.f;
                        if (view != null) {
                            view.setClickable(true);
                        }
                        if (view != null) {
                            view.setFocusable(true);
                        }
                        viewGroup.addView(view, fVar);
                    }
                }
                return s3q0.a;
            case 7:
                izs izsVar = (izs) obj5;
                wh50 wh50Var = (wh50) obj3;
                tho0 tho0Var = (tho0) obj;
                ((wh50) obj4).setValue(tho0Var);
                String str6 = (String) wh50Var.getValue();
                us2 us2Var = tho0Var.a;
                boolean f = epx.f(str6, us2Var.c);
                String str7 = us2Var.c;
                wh50Var.setValue(str7);
                if (!f) {
                    izsVar.invoke(new zlh0.g.a(str7));
                }
                return s3q0.a;
            default:
                return ((ics0) obj5).b((owt) ((izs) obj4).invoke(Integer.valueOf(((x1p) obj3).a)));
        }
    }
}
