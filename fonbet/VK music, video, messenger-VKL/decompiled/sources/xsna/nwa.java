package xsna;

import android.content.res.Resources;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.ImageList;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.messages.MsgFromChannel;
import com.vk.im.engine.models.users.User;
import com.vk.im.engine.models.users.UserNameCase;
import com.vkontakte.android.R;
import java.util.Calendar;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.collections.EmptyList;
import xsna.hag;

/* compiled from: ChannelCommentsItemCreator.kt */
/* loaded from: classes16.dex */
public final class nwa {
    public final sdz a;
    public final meg b;

    public nwa(sdz sdzVar, meg megVar) {
        this.a = sdzVar;
        this.b = megVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f1  */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final hfz a(hag hagVar, int i, MsgFromChannel msgFromChannel, ProfilesSimpleInfo profilesSimpleInfo, LinkedHashSet linkedHashSet) {
        String str;
        long timeInMillis;
        TimeUnit timeUnit;
        boolean z;
        int i2;
        String l;
        String str2;
        String quantityString;
        String d6;
        boolean z2 = hagVar.h;
        hag.b bVar = hagVar.l;
        Integer num = hagVar.k;
        int i3 = hagVar.a;
        if (z2) {
            return new abg(i3, i, hagVar.n, linkedHashSet.contains(Integer.valueOf(i3)));
        }
        UserId userId = hagVar.b;
        Serializer.c<Peer> cVar = Peer.CREATOR;
        qtd0 zb = profilesSimpleInfo.zb(Peer.a.b(userId.b));
        if (zb == null) {
            zb = new User(0L, null, null, null, null, null, null, false, false, null, false, false, null, null, null, null, null, null, null, null, null, false, false, false, 0, null, false, false, false, false, null, null, null, null, null, null, null, null, null, false, false, false, null, false, -1, 4095, null);
        }
        ucp ucpVar = ucp.a;
        CharSequence i4 = ucp.i(this.a.m(hagVar.c));
        List singletonList = hagVar.d.isEmpty() ? EmptyList.b : Collections.singletonList(u6q0.b);
        if (num != null && !epx.f(j5g.a0(hagVar.g), num)) {
            UserId userId2 = hagVar.j;
            qtd0 zb2 = profilesSimpleInfo.zb(userId2 != null ? com.vk.dto.common.a.a(userId2) : null);
            if (zb2 != null && (d6 = zb2.d6(UserNameCase.DAT)) != null) {
                str = d6;
                boolean z3 = (bVar != null ? bVar.c : null) == null;
                int i5 = hagVar.a;
                ImageList C8 = zb.C8();
                String name = zb.name();
                boolean bc = msgFromChannel.bc();
                int i6 = hagVar.e;
                meg megVar = this.b;
                Resources resources = (Resources) megVar.a;
                Calendar calendar = (Calendar) megVar.b.getValue();
                Calendar calendar2 = (Calendar) megVar.c.getValue();
                calendar2.setTimeInMillis(1000 * i6);
                timeInMillis = calendar.getTimeInMillis() - calendar2.getTimeInMillis();
                timeUnit = TimeUnit.MILLISECONDS;
                if (timeUnit.toMinutes(timeInMillis) >= 1) {
                    quantityString = resources.getString(R.string.vkim_channel_comments_date_formatter_just_now);
                } else if (timeUnit.toMinutes(timeInMillis) < 2) {
                    quantityString = resources.getString(R.string.vkim_channel_comments_date_formatter_a_minute_ago);
                } else if (timeUnit.toHours(timeInMillis) < 1) {
                    int minutes = (int) timeUnit.toMinutes(timeInMillis);
                    quantityString = resources.getQuantityString(R.plurals.vkim_channel_comments_date_formatter_minutes_ago, minutes, Integer.valueOf(minutes));
                } else if (timeUnit.toHours(timeInMillis) < 2) {
                    quantityString = resources.getString(R.string.vkim_channel_comments_date_formatter_an_hour_ago);
                } else {
                    if (timeUnit.toHours(timeInMillis) >= 5) {
                        if (c09.d(calendar, calendar2)) {
                            z = true;
                            i2 = 0;
                            l = pvo0.i(true, i6, false, false);
                        } else {
                            z = true;
                            i2 = 0;
                            l = pvo0.l(i6);
                        }
                        str2 = l;
                        return new xbg(i5, C8, name, userId, str, i4, singletonList, str2, bc, i, linkedHashSet.contains(Integer.valueOf(i3)), bVar != null ? bVar.a : i2, z3, hagVar.m != null ? z : i2);
                    }
                    int hours = (int) timeUnit.toHours(timeInMillis);
                    quantityString = resources.getQuantityString(R.plurals.vkim_channel_comments_date_formatter_hours_ago, hours, Integer.valueOf(hours));
                }
                str2 = quantityString;
                z = true;
                i2 = 0;
                return new xbg(i5, C8, name, userId, str, i4, singletonList, str2, bc, i, linkedHashSet.contains(Integer.valueOf(i3)), bVar != null ? bVar.a : i2, z3, hagVar.m != null ? z : i2);
            }
        }
        str = "";
        if ((bVar != null ? bVar.c : null) == null) {
        }
        int i52 = hagVar.a;
        ImageList C82 = zb.C8();
        String name2 = zb.name();
        boolean bc2 = msgFromChannel.bc();
        int i62 = hagVar.e;
        meg megVar2 = this.b;
        Resources resources2 = (Resources) megVar2.a;
        Calendar calendar3 = (Calendar) megVar2.b.getValue();
        Calendar calendar22 = (Calendar) megVar2.c.getValue();
        calendar22.setTimeInMillis(1000 * i62);
        timeInMillis = calendar3.getTimeInMillis() - calendar22.getTimeInMillis();
        timeUnit = TimeUnit.MILLISECONDS;
        if (timeUnit.toMinutes(timeInMillis) >= 1) {
        }
        str2 = quantityString;
        z = true;
        i2 = 0;
        return new xbg(i52, C82, name2, userId, str, i4, singletonList, str2, bc2, i, linkedHashSet.contains(Integer.valueOf(i3)), bVar != null ? bVar.a : i2, z3, hagVar.m != null ? z : i2);
    }
}
