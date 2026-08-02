package xsna;

import com.vk.api.generated.wall.dto.WallActionButtonVkTicketDto;
import com.vk.newsfeed.posting.impl.presentation.model.ActionButton;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.builders.ListBuilder;
import xsna.my;
import xsna.xu;

/* compiled from: ActionButtonsViewStateMapper.kt */
/* loaded from: classes4.dex */
public final class qy {

    /* compiled from: ActionButtonsViewStateMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ActionButton.Type.values().length];
            try {
                iArr[ActionButton.Type.VkTicket.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static void a(my.a aVar, ListBuilder listBuilder, hy hyVar, Integer num, izs izsVar) {
        boolean z;
        xu.a aVar2;
        WallActionButtonVkTicketDto wallActionButtonVkTicketDto;
        String f;
        List<ActionButton> list = aVar.b;
        if ((list instanceof Collection) && list.isEmpty()) {
            return;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((Boolean) izsVar.invoke((ActionButton) it.next())).booleanValue()) {
                if (!listBuilder.isEmpty()) {
                    Iterator<E> it2 = listBuilder.iterator();
                    while (it2.hasNext()) {
                        if (((xu) it2.next()) instanceof xu.b) {
                            z = false;
                            break;
                        }
                    }
                }
                z = true;
                if (num != null) {
                    listBuilder.add(new xu.b(z, num));
                }
                for (ActionButton actionButton : aVar.b) {
                    if (((Boolean) izsVar.invoke(actionButton)).booleanValue()) {
                        ActionButton actionButton2 = aVar.c;
                        boolean f2 = epx.f(actionButton.b, actionButton2 != null ? actionButton2.b : null);
                        if (a.$EnumSwitchMapping$0[actionButton.f.ordinal()] == 1) {
                            if (f2 && actionButton2 != null) {
                                actionButton = actionButton2;
                            }
                            String str = actionButton.e;
                            if (f2 && (wallActionButtonVkTicketDto = actionButton.c) != null && (f = his0.f(wallActionButtonVkTicketDto)) != null) {
                                str = f;
                            }
                            aVar2 = new xu.a(actionButton, f2, str, hyVar.a);
                        } else {
                            aVar2 = new xu.a(actionButton, f2, actionButton.e, false);
                        }
                        listBuilder.add(aVar2);
                    }
                }
                return;
            }
        }
    }
}
