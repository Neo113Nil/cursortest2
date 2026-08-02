package xsna;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.vk.catalog2.common.ui.mvp.holder.group.GroupCardItemVh;
import com.vk.core.view.components.text.VkText;
import com.vk.dto.group.Group;
import com.vk.dto.polls.Poll;
import com.vk.dto.polls.PollOption;
import com.vkontakte.android.R;
import java.util.List;
import xsna.dsb0;
import xsna.h6h;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class hmb implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ hmb(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v6, types: [android.view.View] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.b;
        int i2 = 0;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                mhy.b(((imb) obj2).getContext());
                ((m3g) obj).invoke();
                break;
            case 1:
                h6h h6hVar = (h6h) obj;
                if (((i6h) obj2).c == 1) {
                    PopupMenu popupMenu = new PopupMenu(view.getContext(), view);
                    popupMenu.getMenu().add(0, 0, 0, R.string.community_event_join);
                    popupMenu.getMenu().add(0, 1, 0, R.string.community_event_join_unsure);
                    popupMenu.setOnMenuItemClickListener(new g6h(h6hVar, i2));
                    popupMenu.show();
                    break;
                } else {
                    h6hVar.i.invoke(Boolean.TRUE);
                    break;
                }
            case 2:
                GroupCardItemVh groupCardItemVh = (GroupCardItemVh) obj2;
                Group group = (Group) obj;
                ?? r12 = groupCardItemVh.r;
                groupCardItemVh.h((r12 != 0 ? r12 : null).getContext(), group, null, null, null);
                break;
            case 3:
                ((izs) obj2).invoke(enj.b((VkText) obj));
                break;
            case 4:
                zsb0 zsb0Var = (zsb0) obj2;
                LinearLayout linearLayout = zsb0Var.o;
                Poll poll = (Poll) obj;
                nsb0 nsb0Var = view instanceof nsb0 ? (nsb0) view : null;
                if (nsb0Var != null) {
                    AppCompatCheckBox appCompatCheckBox = nsb0Var.e;
                    int childCount = linearLayout.getChildCount();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= childCount) {
                            i3 = -1;
                        } else if (!epx.f(nsb0Var, linearLayout.getChildAt(i3))) {
                            i3++;
                        }
                    }
                    if (i3 != -1) {
                        boolean Ib = poll.Ib();
                        List<PollOption> list = poll.f;
                        if (Ib) {
                            appCompatCheckBox.toggle();
                        } else if (poll.Bb()) {
                            nsb0Var.f.setVisibility(0);
                            nsb0Var.d.setVisibility(4);
                            appCompatCheckBox.setVisibility(4);
                            int size = list.size();
                            for (int i4 = 0; i4 < size; i4++) {
                                View childAt = linearLayout.getChildAt(i4);
                                if (childAt != null && (childAt instanceof nsb0)) {
                                    nsb0 nsb0Var2 = (nsb0) childAt;
                                    nsb0Var2.setClickable(false);
                                    nsb0Var2.setEnabled(false);
                                    s3q0 s3q0Var = s3q0.a;
                                }
                            }
                        }
                        zsb0Var.d.invoke(new dsb0.d(list.get(i3).b));
                        break;
                    }
                }
                break;
            case 5:
                iph0 iph0Var = (iph0) obj2;
                hph0 hph0Var = (hph0) obj;
                if (iph0Var.b == Integer.MIN_VALUE) {
                    hph0Var.m.invoke();
                    break;
                } else {
                    hph0Var.l.invoke(Integer.valueOf(iph0Var.f));
                    break;
                }
            default:
                ((h7k0) obj2).J.invoke((izs) obj);
                break;
        }
    }

    public /* synthetic */ hmb(i6h i6hVar, h6h.a aVar, h6h h6hVar) {
        this.b = 1;
        this.c = i6hVar;
        this.d = h6hVar;
    }
}
