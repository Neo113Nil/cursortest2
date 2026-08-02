package xsna;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.vk.api.generated.stories.dto.StoriesGifItemDto;
import com.vk.api.generated.stories.dto.StoriesSearchGifResponseDto;
import com.vk.donut.privacy.levels.PrivacyEditDonutLevelsFragment;
import com.vk.dto.common.data.VKList;
import com.vk.dto.group.AdminLeaveAction;
import com.vk.dto.stories.model.GifItem;
import com.vk.im.ui.components.common.NotifyId;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.q7h;
import xsna.u6h;
import xsna.xgs0;
import xsna.xn50;

/* compiled from: CollageGridsAdapter.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class o1g extends FunctionReferenceImpl implements izs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o1g(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        AdminLeaveAction adminLeaveAction;
        AdminLeaveAction adminLeaveAction2;
        switch (this.b) {
            case 0:
                int intValue = ((Number) obj).intValue();
                cws cwsVar = ((p1g) this.receiver).c;
                if (cwsVar != null) {
                    cwsVar.invoke(Integer.valueOf(intValue));
                }
                return s3q0.a;
            case 1:
                q7h q7hVar = (q7h) obj;
                u6h u6hVar = (u6h) this.receiver;
                int i = u6h.m1;
                u6hVar.getClass();
                if (epx.f(q7hVar, q7h.a.a)) {
                    u6hVar.hide();
                } else {
                    if (!(q7hVar instanceof q7h.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Bundle arguments = u6hVar.getArguments();
                    String string = arguments != null ? arguments.getString("request_key") : null;
                    if (string != null) {
                        FragmentManager parentFragmentManager = u6hVar.getParentFragmentManager();
                        int i2 = u6h.c.$EnumSwitchMapping$0[((q7h.b) q7hVar).a.ordinal()];
                        if (i2 == 1) {
                            adminLeaveAction2 = AdminLeaveAction.STAY_ADMIN;
                        } else {
                            if (i2 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            adminLeaveAction2 = AdminLeaveAction.LEAVE_ADMIN;
                        }
                        Pair pair = new Pair("selected_choice", adminLeaveAction2);
                        Bundle arguments2 = u6hVar.getArguments();
                        Pair pair2 = new Pair("source", arguments2 != null ? arguments2.getString("source") : null);
                        Bundle arguments3 = u6hVar.getArguments();
                        parentFragmentManager.k0(yfb.b(pair, pair2, new Pair("track_code", arguments3 != null ? arguments3.getString("track_code") : null)), string);
                    }
                    izs<? super u6h.b, s3q0> izsVar = u6hVar.l1;
                    if (izsVar != null) {
                        int i3 = u6h.c.$EnumSwitchMapping$0[((q7h.b) q7hVar).a.ordinal()];
                        if (i3 == 1) {
                            adminLeaveAction = AdminLeaveAction.STAY_ADMIN;
                        } else {
                            if (i3 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            adminLeaveAction = AdminLeaveAction.LEAVE_ADMIN;
                        }
                        Bundle arguments4 = u6hVar.getArguments();
                        String string2 = arguments4 != null ? arguments4.getString("source") : null;
                        Bundle arguments5 = u6hVar.getArguments();
                        izsVar.invoke(new u6h.b(adminLeaveAction, string2, arguments5 != null ? arguments5.getString("track_code") : null));
                    }
                    u6hVar.hide();
                }
                return s3q0.a;
            case 2:
                zam zamVar = ((xam) this.receiver).u;
                if (zamVar != null) {
                    zamVar.b();
                }
                return s3q0.a;
            case 3:
                mem memVar = (mem) this.receiver;
                fvr.l(memVar.i, (String) obj);
                if (memVar.s != null) {
                    zk70.c(NotifyId.COPY_TO_CLIPBOARD_DONE);
                }
                return s3q0.a;
            case 4:
                StoriesSearchGifResponseDto storiesSearchGifResponseDto = (StoriesSearchGifResponseDto) obj;
                nul0 nul0Var = (nul0) this.receiver;
                nul0Var.getClass();
                VKList vKList = new VKList();
                vKList.n(storiesSearchGifResponseDto.e());
                for (StoriesGifItemDto storiesGifItemDto : storiesSearchGifResponseDto.d()) {
                    wx4 wx4Var = nul0Var.a;
                    wx4Var.getClass();
                    String valueOf = String.valueOf(storiesGifItemDto.d());
                    ne6 ne6Var = (ne6) wx4Var.b;
                    List D0 = j5g.D0(new l720(1), storiesGifItemDto.e());
                    ne6Var.getClass();
                    vKList.add(new GifItem(valueOf, ne6.a(D0), null));
                }
                return vKList;
            case 5:
                return ak10.n((ak10) this.receiver, (String) obj);
            case 6:
                ((usw) this.receiver).o((mlp) obj);
                return s3q0.a;
            case 7:
                PrivacyEditDonutLevelsFragment privacyEditDonutLevelsFragment = (PrivacyEditDonutLevelsFragment) this.receiver;
                privacyEditDonutLevelsFragment.getClass();
                xn50.a.c(privacyEditDonutLevelsFragment, (xcd0) obj);
                return s3q0.a;
            default:
                xgs0 xgs0Var = (xgs0) obj;
                ffs0 ffs0Var = (ffs0) this.receiver;
                h0a h0aVar = ffs0Var.a;
                if (xgs0Var instanceof xgs0.c) {
                    h0aVar.getClass();
                } else if (xgs0Var instanceof xgs0.a) {
                    h0aVar.getClass();
                } else {
                    if (!(xgs0Var instanceof xgs0.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    View view = (View) ffs0Var.b.invoke();
                    view.getHeight();
                    view.getLayoutParams();
                    iah0.a(22);
                    h0aVar.getClass();
                }
                return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1g(Object obj, int i) {
        super(1, obj, xam.class, "onSendAddFriendSuccess", "onSendAddFriendSuccess(Lcom/vk/im/engine/models/Profile;)V", 0);
        this.b = i;
        switch (i) {
            case 3:
                super(1, obj, mem.class, "onCopyToClipboardSuccess", "onCopyToClipboardSuccess(Ljava/lang/String;)V", 0);
                break;
            case 4:
                super(1, obj, nul0.class, "map", "map(Lcom/vk/api/generated/stories/dto/StoriesSearchGifResponseDto;)Lcom/vk/dto/common/data/VKList;", 0);
                break;
            default:
                break;
        }
    }
}
