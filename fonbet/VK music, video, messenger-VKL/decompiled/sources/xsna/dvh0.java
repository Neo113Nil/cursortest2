package xsna;

import android.content.Context;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.catalog.mvi.block.video.impl.p002short.ShortVideoListView;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.dto.music.Artist;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.im.engine.models.attaches.AttachSticker;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.profile.user.impl.UserProfileDialogs;
import com.vk.profile.user.impl.ui.UserProfileAction;
import com.vk.superapp.api.dto.widgets.actions.WebAction;
import com.vk.superapp.core.errors.VkAppsErrors;
import com.vk.superapp.ui.widgets.tile.TileBottomContent;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.moq0;
import xsna.nak;
import xsna.tyk0;
import xsna.uml0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class dvh0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ dvh0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                Artist artist = (Artist) this.c;
                break;
            case 1:
                s2u0 s2u0Var = (s2u0) obj;
                ((izs) this.c).invoke(new ShortVideoListView.d.C0465d(((ShortVideoListView.e) this.d).b, s2u0Var.b(), s2u0Var.a()));
                break;
            case 2:
                tyk0.a aVar = (tyk0.a) this.c;
                break;
            case 3:
                StickerStockItem stickerStockItem = (StickerStockItem) this.c;
                s3l0 s3l0Var = (s3l0) this.d;
                if (((BaseBoolIntDto) obj) == BaseBoolIntDto.YES) {
                    stickerStockItem.R = Boolean.FALSE;
                    d790 d790Var = s3l0Var.d;
                    if (d790Var == null) {
                        d790Var = null;
                    }
                    s3l0Var.z(d790Var, false);
                }
                break;
            case 4:
                cpl0 cpl0Var = (cpl0) this.c;
                bpl0 bpl0Var = (bpl0) this.d;
                g47 g47Var = (g47) obj;
                l370.o(g47Var, new hp30(bpl0Var, cpl0Var), f9t.z(cpl0Var), new tml0(bpl0Var, 0));
                l370.m(g47Var, f9t.w(cpl0Var));
                g47Var.d(new uml0.a(cpl0Var));
                break;
            case 5:
                TileBottomContent tileBottomContent = (TileBottomContent) this.c;
                fcn0 fcn0Var = (fcn0) this.d;
                WebAction webAction = tileBottomContent.e;
                if (webAction != null) {
                    u7n0 u7n0Var = fcn0Var.p;
                    Context context = fcn0Var.itemView.getContext();
                    Object obj2 = fcn0Var.l;
                    if (obj2 == null) {
                        obj2 = null;
                    }
                    u7n0Var.b(context, webAction, (f9n0) obj2, null);
                }
                break;
            case 6:
                d040 d040Var = (d040) this.c;
                f9q0 f9q0Var = (f9q0) this.d;
                MsgFromUser msgFromUser = (MsgFromUser) d040Var.L(f9q0Var.b.b);
                ((AttachSticker) j5g.Y(msgFromUser.H)).g = f9q0Var.c;
                d040Var.o(msgFromUser);
                break;
            case 7:
                UserProfileDialogs userProfileDialogs = (UserProfileDialogs) this.c;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.d;
                userProfileDialogs.a.a(new UserProfileAction.m.f((moq0.d) obj));
                VkContextMenu vkContextMenu = (VkContextMenu) ref$ObjectRef.element;
                if (vkContextMenu != null) {
                    vkContextMenu.b();
                }
                break;
            default:
                Ref$ObjectRef ref$ObjectRef2 = (Ref$ObjectRef) this.c;
                mov0 mov0Var = (mov0) this.d;
                nak nakVar = (nak) obj;
                bqu0 bqu0Var = (bqu0) ref$ObjectRef2.element;
                if (bqu0Var != null) {
                    bqu0Var.dismiss();
                }
                if (nakVar instanceof nak.b) {
                    mov0Var.h(VkAppsErrors.Client.UNKNOWN_ERROR);
                }
                break;
        }
        return s3q0.a;
    }
}
