package xsna;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetResponseDto;
import com.vk.core.view.components.placeholder.VkPlaceholder;
import com.vk.log.L;
import com.vk.newsfeed.posting.impl.presentation.base.view.PostingContentView;
import com.vk.newsfeed.posting.music_picker.domain.model.MusicPickerList;
import com.vk.newsfeed.posting.music_picker.domain.model.MusicPickerState;
import com.vk.queue.events.PhotoVerticalizationQueueEvent$RestrictionsException;
import com.vk.voip.miniapps.impl.picture_in_picture.feature.data.MiniAppNetworkState;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;
import xsna.e3m;
import xsna.gy50;
import xsna.uav;
import xsna.wpr0;
import xsna.xn50;

/* compiled from: CatalogOnboardingBottomSheet.kt */
/* loaded from: classes5.dex */
public final /* synthetic */ class pba extends FunctionReferenceImpl implements izs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pba(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Drawable drawable;
        MiniAppNetworkState miniAppNetworkState;
        switch (this.b) {
            case 0:
                oba obaVar = (oba) this.receiver;
                obaVar.getClass();
                xn50.a.c(obaVar, (a080) obj);
                return s3q0.a;
            case 1:
                L.i((Throwable) obj);
                return s3q0.a;
            case 2:
                Throwable th = (Throwable) obj;
                sgc sgcVar = ((com.vk.ecomm.catalog.impl.geo.b) this.receiver).b;
                RecyclerView recyclerView = sgcVar.h1;
                if (recyclerView == null) {
                    recyclerView = null;
                }
                View view = sgcVar.i1;
                if (view == null) {
                    view = null;
                }
                VkPlaceholder vkPlaceholder = sgcVar.j1;
                if (vkPlaceholder == null) {
                    vkPlaceholder = null;
                }
                sgcVar.Zn(recyclerView, view, vkPlaceholder);
                RecyclerView recyclerView2 = sgcVar.h1;
                if (recyclerView2 == null) {
                    recyclerView2 = null;
                }
                recyclerView2.setVisibility(4);
                View view2 = sgcVar.i1;
                if (view2 == null) {
                    view2 = null;
                }
                f4m.j(view2);
                VkPlaceholder vkPlaceholder2 = sgcVar.j1;
                if (vkPlaceholder2 == null) {
                    vkPlaceholder2 = null;
                }
                vkPlaceholder2.setVisibility(0);
                qgc qgcVar = sgcVar.k1;
                (qgcVar != null ? qgcVar : null).setItems(EmptyList.b);
                h03.b(th);
                L.i(th);
                return s3q0.a;
            case 3:
                ((fgj0) this.receiver).getClass();
                return fgj0.a((ShortVideoGetResponseDto) obj);
            case 4:
                j03.l((Throwable) obj);
                return s3q0.a;
            case 5:
                uo20 uo20Var = (uo20) obj;
                vo20 vo20Var = (vo20) this.receiver;
                if (uo20Var == null) {
                    vo20Var.c.load("https://" + a0a.d + "/images/camera_400.png?ava=1");
                    vo20Var.d.clear();
                    vo20Var.e.setText("");
                } else {
                    x59.b(vo20Var.c, uo20Var.c);
                    x59.b(vo20Var.d, uo20Var.c);
                    if (uo20Var.d) {
                        vo20Var.e.setText(R.string.voip_call_own_name);
                    } else {
                        vo20Var.e.setText(uo20Var.b);
                    }
                    bwt0.p0(vo20Var.j, (uo20Var.f || uo20Var.d) ? false : true);
                    if (uo20Var.d || (miniAppNetworkState = uo20Var.e) == MiniAppNetworkState.GOOD || (drawable = vo20Var.m) == null) {
                        drawable = null;
                    } else {
                        l7s l7sVar = vo20Var.a;
                        int a = vo20.a(miniAppNetworkState);
                        e3m.a aVar = e3m.a;
                        drawable.setTint(l7sVar.getColor(a));
                    }
                    vo20Var.e.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
                }
                return s3q0.a;
            case 6:
                ((com.vk.newsfeed.posting.music_picker.presentation.model.a) this.receiver).getClass();
                MusicPickerList musicPickerList = (MusicPickerList) j5g.k0(((MusicPickerState) obj).j);
                if (musicPickerList instanceof MusicPickerList.Playlists) {
                    return y8g0.e(R.string.music_picker_toolbar_title_playlists);
                }
                if (musicPickerList instanceof MusicPickerList.Tracks) {
                    return y8g0.e(R.string.music_picker_toolbar_title);
                }
                if (!(musicPickerList instanceof MusicPickerList.SelectedPlaylist)) {
                    return "";
                }
                String str = ((MusicPickerList.SelectedPlaylist) musicPickerList).c.h;
                return str == null ? y8g0.e(R.string.music_picker_toolbar_title) : str;
            case 7:
                return ((mab0) this.receiver).a(((Number) obj).intValue());
            case 8:
                PostingContentView.a((PostingContentView) this.receiver, (wpc0) obj);
                return s3q0.a;
            case 9:
                Throwable th2 = (Throwable) obj;
                npr0 npr0Var = (npr0) this.receiver;
                npr0Var.getClass();
                npr0Var.i.b(h03.a(th2) ? new wpr0.c.C3949c(th2) : th2 instanceof PhotoVerticalizationQueueEvent$RestrictionsException ? new wpr0.c.b(th2) : new wpr0.c.a(th2));
                return s3q0.a;
            default:
                uav uavVar = (uav) obj;
                mjw0 mjw0Var = (mjw0) this.receiver;
                com.vk.voip.ui.hint.a aVar2 = mjw0Var.W;
                if (uavVar instanceof uav.b) {
                    aVar2.d(((uav.b) uavVar).a);
                } else if (uavVar instanceof uav.c) {
                    aVar2.d(((uav.c) uavVar).a);
                } else if (uavVar instanceof uav.d) {
                    aVar2.d(((uav.d) uavVar).a);
                } else {
                    if (!(uavVar instanceof uav.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    mjw0Var.S0.a(new gy50.d((uav.a) uavVar));
                }
                return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pba(Object obj, int i) {
        super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
        this.b = i;
        switch (i) {
            case 3:
                super(1, obj, fgj0.class, "map", "map(Lcom/vk/api/generated/shortVideo/dto/ShortVideoGetResponseDto;)Lcom/vk/dto/common/ClipVideoFile;", 0);
                break;
            case 4:
                super(1, obj, j03.class, "showErrorToast", "showErrorToast(Ljava/lang/Throwable;)V", 0);
                break;
            case 5:
            default:
                break;
            case 6:
                super(1, obj, com.vk.newsfeed.posting.music_picker.presentation.model.a.class, "mapTitle", "mapTitle(Lcom/vk/newsfeed/posting/music_picker/domain/model/MusicPickerState;)Ljava/lang/String;", 0);
                break;
        }
    }
}
