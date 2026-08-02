package xsna;

import android.widget.EditText;
import com.vk.api.generated.stickers.dto.StickersPopupSettingsDto;
import com.vk.common.links.AwayLink;
import com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout;
import com.vk.dto.stickers.bonus.StickerStockItemDiscounts;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.user.UserProfile;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vk.profile.questions.impl.QuestionsUsableRecyclerPaginatedView;
import com.vk.voip.ui.actions.feature.VoipActionsFeatureState;
import java.util.List;
import me.grishka.appkit.views.UsableRecyclerPaginatedView;
import xsna.p7w0;
import xsna.q8a0;
import xsna.qjc;
import xsna.xuw0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class he40 implements io.reactivex.rxjava3.functions.l, SwipeDrawableRefreshLayout.g, qjc.a, io.reactivex.rxjava3.functions.m, io.reactivex.rxjava3.core.s, io.reactivex.rxjava3.functions.c, yads.ng1, yads.uq2 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ he40(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.qjc.a
    public void I(AwayLink awayLink) {
        ysg0.b.a(new oru0((String) this.c));
    }

    @Override // yads.uq2
    public void a(yads.mn3 mn3Var) {
        yads.ex1.a((yads.dx1) this.c, mn3Var);
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 0:
                return (tt70) ((uuz) this.c).invoke(obj);
            case 1:
                return (io.reactivex.rxjava3.core.b0) ((bl30) this.c).invoke(obj);
            case 2:
                return (q8a0.a) ((lx60) this.c).invoke(obj);
            case 3:
                return (List) ((pf40) this.c).invoke(obj);
            case 4:
                return (com.vk.newsfeed.posting.geo_picker.presentation.g) ((ihb) this.c).invoke(obj);
            case 5:
                return (StickersPopupSettingsDto) ((u4u) this.c).invoke(obj);
            case 6:
                return (UserProfile) ((uuz) this.c).invoke(obj);
            case 7:
            case 10:
            case 17:
            case 20:
            case 23:
            default:
                return (xuw0.a) ((kyq0) this.c).invoke(obj);
            case 8:
                return (List) ((uuz) this.c).invoke(obj);
            case 9:
                return (Integer) ((uuz) this.c).invoke(obj);
            case 11:
                return (StickerStockItemDiscounts) ((uuz) this.c).invoke(obj);
            case 12:
                return (AboutVideoItem.d) ((bl30) this.c).invoke(obj);
            case 13:
                return (String) ((uuz) this.c).invoke(obj);
            case 14:
                return (io.reactivex.rxjava3.core.e) ((jp5) this.c).invoke(obj);
            case 15:
                return (wia0) ((u41) this.c).invoke(obj);
            case 16:
                return (io.reactivex.rxjava3.core.b0) ((p5t0) this.c).invoke(obj);
            case 18:
                return (io.reactivex.rxjava3.core.b0) ((com.vk.video.ui.discovery.minimizable.dialog.related_videos.c) this.c).invoke(obj);
            case 19:
                return (StoryEntry) ((n9b) this.c).invoke(obj);
            case 21:
                return (azm0) ((izs) this.c).invoke(obj);
            case 22:
                return (p7w0.f.b) ((y6w0) this.c).invoke(obj);
            case 24:
                return (it80) ((lwp0) this.c).invoke(obj);
        }
    }

    @Override // com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout.g
    public void h() {
        QuestionsUsableRecyclerPaginatedView questionsUsableRecyclerPaginatedView = (QuestionsUsableRecyclerPaginatedView) this.c;
        int i = QuestionsUsableRecyclerPaginatedView.U;
        UsableRecyclerPaginatedView.a emptyViewRefreshListener = questionsUsableRecyclerPaginatedView.getEmptyViewRefreshListener();
        if (emptyViewRefreshListener != null) {
            emptyViewRefreshListener.h();
        }
    }

    @Override // yads.ng1
    public void invoke(Object obj) {
        ((yads.ao0) this.c).c((yads.nf2) obj);
    }

    @Override // io.reactivex.rxjava3.core.s
    public void subscribe(io.reactivex.rxjava3.core.r rVar) {
        EditText editText = (EditText) this.c;
        zvt0 zvt0Var = new zvt0(rVar);
        editText.addTextChangedListener(zvt0Var);
        rVar.a(new rnt0(editText, zvt0Var, 1));
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        return ((Boolean) ((lwp0) this.c).invoke(obj)).booleanValue();
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        return (VoipActionsFeatureState.t) ((mq2) this.c).invoke(obj, obj2);
    }
}
