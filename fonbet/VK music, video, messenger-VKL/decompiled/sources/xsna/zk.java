package xsna;

import android.content.Context;
import com.vk.voip.ui.accessibility.AccessibilityEvents;
import com.vk.voip.ui.accessibility.b;
import com.vkontakte.android.R;
import java.util.Collection;
import java.util.Map;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class zk implements zzs {
    public final /* synthetic */ nl b;
    public final /* synthetic */ com.vk.voip.ui.accessibility.b c;

    public /* synthetic */ zk(nl nlVar, com.vk.voip.ui.accessibility.b bVar) {
        this.b = nlVar;
        this.c = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.zzs
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        AccessibilityEvents.Event event = (AccessibilityEvents.Event) obj;
        int intValue = ((Integer) obj2).intValue();
        Collection collection = (Collection) obj3;
        Map map = (Map) obj4;
        Context context = this.c.a;
        int[] iArr = b.a.$EnumSwitchMapping$0;
        Integer num = null;
        String str = "";
        if (iArr[event.ordinal()] == 1) {
            int i = 0;
            int i2 = 0;
            for (Map.Entry entry : map.entrySet()) {
                int intValue2 = ((Number) entry.getValue()).intValue();
                if (intValue2 > i) {
                    num = entry.getKey();
                    i = intValue2;
                }
                i2 += intValue2;
            }
            CharSequence charSequence = (CharSequence) num;
            if (charSequence != null && charSequence.length() != 0) {
                if (collection.size() == 1) {
                    str = context.getString(R.string.voip_accessibility_reactions, ((AccessibilityEvents.a) j5g.X(collection)).b, num);
                } else if (i != 0) {
                    str = context.getResources().getQuantityString(R.plurals.voip_accessibility_reactions_plural, i, Integer.valueOf(i), num);
                    if (i2 > i) {
                        StringBuilder e = fw3.e(str);
                        e.append(context.getString(R.string.voip_accessibility_reactions_other, Integer.valueOf(i2 - i)));
                        str = e.toString();
                    }
                }
            }
        } else if (intValue > 0) {
            if (intValue == 1 && collection.size() == 1) {
                Collection collection2 = collection;
                boolean z = ((AccessibilityEvents.a) j5g.X(collection2)).c;
                switch (iArr[event.ordinal()]) {
                    case 2:
                        num = Integer.valueOf(z ? R.string.voip_accessibility_user_joined_female : R.string.voip_accessibility_user_joined_male);
                        break;
                    case 3:
                        num = Integer.valueOf(z ? R.string.voip_accessibility_user_left_female : R.string.voip_accessibility_user_left_male);
                        break;
                    case 4:
                        num = Integer.valueOf(z ? R.string.voip_accessibility_user_hand_raised_female : R.string.voip_accessibility_user_hand_raised_male);
                        break;
                    case 5:
                        num = Integer.valueOf(z ? R.string.voip_accessibility_user_hand_lowered_female : R.string.voip_accessibility_user_hand_lowered_male);
                        break;
                    case 6:
                        num = Integer.valueOf(z ? R.string.voip_accessibility_screencast_start_female : R.string.voip_accessibility_screencast_start_male);
                        break;
                    case 7:
                        num = Integer.valueOf(z ? R.string.voip_accessibility_screencast_stop_female : R.string.voip_accessibility_screencast_stop_male);
                        break;
                    case 8:
                        num = Integer.valueOf(z ? R.string.voip_accessibility_watch_together_start_female : R.string.voip_accessibility_watch_together_start_male);
                        break;
                    case 9:
                        num = Integer.valueOf(z ? R.string.voip_accessibility_watch_together_stop_female : R.string.voip_accessibility_watch_together_stop_male);
                        break;
                    case 10:
                        num = Integer.valueOf(z ? R.string.voip_accessibility_record_start_female : R.string.voip_accessibility_record_start_male);
                        break;
                    case 11:
                        num = Integer.valueOf(z ? R.string.voip_accessibility_record_stop_female : R.string.voip_accessibility_record_stop_male);
                        break;
                    case 12:
                        num = Integer.valueOf(z ? R.string.voip_accessibility_stream_start_female : R.string.voip_accessibility_stream_start_male);
                        break;
                    case 13:
                        num = Integer.valueOf(z ? R.string.voip_accessibility_stream_stop_female : R.string.voip_accessibility_stream_stop_male);
                        break;
                }
                if (num != null) {
                    str = context.getString(num.intValue(), ((AccessibilityEvents.a) j5g.X(collection2)).b);
                }
            } else if (intValue == 2 && collection.size() == 2) {
                switch (iArr[event.ordinal()]) {
                    case 2:
                        num = Integer.valueOf(R.string.voip_accessibility_users_joined);
                        break;
                    case 3:
                        num = Integer.valueOf(R.string.voip_accessibility_users_left);
                        break;
                    case 4:
                        num = Integer.valueOf(R.string.voip_accessibility_users_hand_raised);
                        break;
                    case 5:
                        num = Integer.valueOf(R.string.voip_accessibility_users_hand_lowered);
                        break;
                    case 6:
                        num = Integer.valueOf(R.string.voip_accessibility_users_screencast_start);
                        break;
                    case 7:
                        num = Integer.valueOf(R.string.voip_accessibility_users_screencast_stop);
                        break;
                    case 8:
                        num = Integer.valueOf(R.string.voip_accessibility_watch_together_start_users);
                        break;
                    case 9:
                        num = Integer.valueOf(R.string.voip_accessibility_watch_together_stop_users);
                        break;
                    case 10:
                        num = Integer.valueOf(R.string.voip_accessibility_record_start_users);
                        break;
                    case 11:
                        num = Integer.valueOf(R.string.voip_accessibility_record_stop_users);
                        break;
                    case 12:
                        num = Integer.valueOf(R.string.voip_accessibility_stream_start_users);
                        break;
                    case 13:
                        num = Integer.valueOf(R.string.voip_accessibility_stream_stop_users);
                        break;
                }
                if (num != null) {
                    str = context.getString(num.intValue(), j5g.g0(collection, ", ", null, null, 0, new ol(0), 30));
                }
            } else {
                switch (iArr[event.ordinal()]) {
                    case 2:
                        num = Integer.valueOf(R.plurals.voip_accessibility_users_joined_plural);
                        break;
                    case 3:
                        num = Integer.valueOf(R.plurals.voip_accessibility_users_left_plural);
                        break;
                    case 4:
                        num = Integer.valueOf(R.plurals.voip_accessibility_users_hand_raised_plural);
                        break;
                    case 5:
                        num = Integer.valueOf(R.plurals.voip_accessibility_users_hand_lowered_plural);
                        break;
                    case 6:
                        num = Integer.valueOf(R.plurals.voip_accessibility_screencast_start_plural);
                        break;
                    case 7:
                        num = Integer.valueOf(R.plurals.voip_accessibility_screencast_stop_plural);
                        break;
                    case 8:
                        num = Integer.valueOf(R.plurals.voip_accessibility_watch_together_start_plural);
                        break;
                    case 9:
                        num = Integer.valueOf(R.plurals.voip_accessibility_watch_together_stop_plural);
                        break;
                    case 10:
                        num = Integer.valueOf(R.plurals.voip_accessibility_record_start_plural);
                        break;
                    case 11:
                        num = Integer.valueOf(R.plurals.voip_accessibility_record_stop_plural);
                        break;
                    case 12:
                        num = Integer.valueOf(R.plurals.voip_accessibility_stream_start_plural);
                        break;
                    case 13:
                        num = Integer.valueOf(R.plurals.voip_accessibility_stream_stop_plural);
                        break;
                }
                if (num != null) {
                    str = enj.f(num.intValue(), intValue, context);
                }
            }
        }
        this.b.h(str);
        return s3q0.a;
    }
}
