package xsna;

import android.view.View;
import com.vk.community.tool.view.header.actionbuttons.OnMeasureCustomActionsView;
import com.vk.core.view.components.button.VkButton;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vk.profile.community.impl.ui.tag.CommunityActionTags;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.xrh;

/* compiled from: CommunityActionButtonsViewDataDelegate.kt */
/* loaded from: classes5.dex */
public final class jpg {
    public final h7v a;
    public final izs<CommunityProfileAction, s3q0> b;

    /* JADX WARN: Multi-variable type inference failed */
    public jpg(h7v h7vVar, izs<? super CommunityProfileAction, s3q0> izsVar) {
        this.a = h7vVar;
        this.b = izsVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c2, code lost:
    
        if (r13 != (-1)) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c4, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ca, code lost:
    
        if (r7 == null) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00cc, code lost:
    
        r7 = r9.getChildAt(r7.intValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d4, code lost:
    
        if (r7 == null) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d6, code lost:
    
        xsna.bwt0.n(r7, new xsna.vh9(r16, r9, r10, 5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00c6, code lost:
    
        r7 = java.lang.Integer.valueOf(r13);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(b3h b3hVar, gpg gpgVar, wzs<? super View, ? super CommunityActionTags, s3q0> wzsVar, boolean z) {
        VkButton vkButton = b3hVar.f;
        VkButton vkButton2 = b3hVar.g;
        VkButton vkButton3 = b3hVar.i;
        VkButton vkButton4 = b3hVar.h;
        ArrayList arrayList = gpgVar.c;
        boolean isEmpty = arrayList.isEmpty();
        OnMeasureCustomActionsView onMeasureCustomActionsView = b3hVar.a;
        onMeasureCustomActionsView.setVisibility(!isEmpty ? 0 : 8);
        List<epg> list = isEmpty ? EmptyList.b : arrayList;
        if (!epx.f(b3hVar.c, list)) {
            b3hVar.c = list;
            epg epgVar = (epg) j5g.b0(0, list);
            epg epgVar2 = (epg) j5g.b0(1, list);
            epg epgVar3 = (epg) j5g.b0(2, list);
            if (epgVar != null) {
                b3hVar.a(vkButton, epgVar);
                vkButton.setMode(epgVar.f ? VkButton.Mode.Primary : VkButton.Mode.Secondary);
                vkButton.setVisibility(0);
                b3h.d(vkButton, epgVar2 == null);
            } else {
                vkButton.setVisibility(8);
            }
            if (epgVar2 != null) {
                b3hVar.a(vkButton2, epgVar2);
                b3h.b(vkButton4, epgVar2);
                vkButton2.setVisibility(0);
                b3h.d(vkButton2, epgVar3 == null);
            } else {
                vkButton2.setVisibility(8);
            }
            vkButton4.setVisibility(8);
            b3h.d(vkButton2, epgVar3 == null);
            if (epgVar3 != null) {
                b3h.b(vkButton3, epgVar3);
                vkButton3.setVisibility(0);
            } else {
                vkButton3.setVisibility(8);
            }
            onMeasureCustomActionsView.requestLayout();
        }
        xrh.d.a aVar = gpgVar.h;
        if (aVar != null) {
            Iterator it = arrayList.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                Object next = it.next();
                if (i < 0) {
                    e43.t();
                    throw null;
                }
                if (aVar.d == ((epg) next).b) {
                    break;
                } else {
                    i++;
                }
            }
        }
        if (z) {
            VkButton.Appearance appearance = VkButton.Appearance.Overlay;
            vkButton.setAppearance(appearance);
            VkButton.Mode mode = VkButton.Mode.Primary;
            vkButton.setMode(mode);
            vkButton2.setAppearance(appearance);
            vkButton2.setMode(mode);
            vkButton4.setAppearance(appearance);
            vkButton4.setMode(mode);
            vkButton3.setAppearance(appearance);
            vkButton3.setMode(mode);
        }
        b3hVar.e = isEmpty ? null : new hpg(this, gpgVar, wzsVar);
        int i2 = 0;
        while (i2 < onMeasureCustomActionsView.getChildCount()) {
            int i3 = i2 + 1;
            View childAt = onMeasureCustomActionsView.getChildAt(i2);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            jjc.f(b3hVar.d, childAt);
            i2 = i3;
        }
    }
}
