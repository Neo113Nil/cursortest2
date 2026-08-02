package xsna;

import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.dto.common.id.UserId;
import com.vk.video.profile.presentation.models.StateProfileSubscribe;
import com.vk.video.profile.presentation.models.StateSubscribeNotification;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: VideoProfileCatalogUtils.kt */
/* loaded from: classes6.dex */
public final class j7t0 {
    public final q3a a;
    public Integer b;
    public UIBlock c;

    /* compiled from: VideoProfileCatalogUtils.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StateSubscribeNotification.values().length];
            try {
                iArr[StateSubscribeNotification.SUBSCRIBE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StateSubscribeNotification.UNSUBSCRIBE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StateSubscribeNotification.ALL_NOTIFICATIONS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[StateSubscribeNotification.PREFER_NOTIFICATIONS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[StateSubscribeNotification.NONE_NOTIFICATIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public j7t0(q3a q3aVar) {
        this.a = q3aVar;
    }

    public static boolean b(UIBlock uIBlock, izs izsVar) {
        if (!(uIBlock instanceof UIBlockList)) {
            return ((Boolean) izsVar.invoke(uIBlock)).booleanValue();
        }
        if (((Boolean) izsVar.invoke(uIBlock)).booleanValue()) {
            return true;
        }
        ArrayList<UIBlock> arrayList = ((UIBlockList) uIBlock).y;
        if (arrayList != null && arrayList.isEmpty()) {
            return false;
        }
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            if (b((UIBlock) it.next(), izsVar)) {
                return true;
            }
        }
        return false;
    }

    public final void a(StateProfileSubscribe stateProfileSubscribe, UserId userId) {
        this.a.b(new buz(12, new jvl0(this), new xd0(7, userId, stateProfileSubscribe)), false);
    }
}
