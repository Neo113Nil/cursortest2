package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import com.vk.dto.common.ImageSizeKey;
import com.vk.dto.common.im.Image;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.user.UserSex;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vkontakte.android.R;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import xsna.snx;

/* compiled from: SenderInfoProvider.kt */
@SuppressLint({"SimpleDateFormat"})
/* loaded from: classes2.dex */
public final class zji0 {
    public final Context a;
    public final com.vk.im.ui.views.avatars.b b;
    public final Date c;
    public final long d;
    public final SimpleDateFormat e;
    public final SimpleDateFormat f;
    public final long g;

    public zji0(Context context) {
        int rawOffset;
        this.a = context;
        this.b = new com.vk.im.ui.views.avatars.b(context, true);
        TimeZone timeZone = TimeZone.getDefault();
        Date date = new Date();
        this.c = date;
        if (timeZone.inDaylightTime(date)) {
            rawOffset = timeZone.getDSTSavings() + timeZone.getRawOffset();
        } else {
            rawOffset = timeZone.getRawOffset();
        }
        this.d = rawOffset;
        DateFormatSymbols dateFormatSymbols = new DateFormatSymbols();
        dateFormatSymbols.setMonths(context.getResources().getStringArray(R.array.months_full_dep));
        this.e = new SimpleDateFormat(context.getString(R.string.vkim_msg_list_time_this_year), dateFormatSymbols);
        this.f = new SimpleDateFormat(context.getString(R.string.vkim_msg_list_time_etc), dateFormatSymbols);
        Calendar calendar = Calendar.getInstance(timeZone);
        calendar.setTimeInMillis(qni0.a());
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        this.g = calendar.getTimeInMillis();
    }

    public final String a(qtd0 qtd0Var, Dialog dialog, boolean z, String str) {
        if (qtd0Var == null) {
            return "";
        }
        boolean Jc = dialog.Jc();
        Context context = this.a;
        return Jc ? z ? context.getString(R.string.im_chat_clips_sent_you, str) : context.getString(R.string.im_chat_clips_sent_they, str) : z ? context.getString(R.string.im_chat_clips_sent_they, str) : qtd0Var.B2() == UserSex.MALE ? context.getString(R.string.im_chat_clips_sent_male, str) : qtd0Var.B2() == UserSex.FEMALE ? context.getString(R.string.im_chat_clips_sent_female, str) : context.getString(R.string.im_chat_clips_sent_they, str);
    }

    public final String b(long j) {
        this.c.setTime(j);
        StringBuilder sb = new StringBuilder();
        long j2 = j + this.d;
        int millis = (int) ((j2 / TimeUnit.HOURS.toMillis(1L)) % 24);
        int millis2 = (int) ((j2 / TimeUnit.MINUTES.toMillis(1L)) % 60);
        if (millis < 10) {
            sb.append(ImageSizeKey.SIZE_KEY_UNDEFINED);
        }
        sb.append(millis);
        sb.append(':');
        if (millis2 < 10) {
            sb.append(ImageSizeKey.SIZE_KEY_UNDEFINED);
        }
        sb.append(millis2);
        return sb.toString();
    }

    public final snx.b.c c(qtd0 qtd0Var) {
        Drawable drawable;
        ImageList C8;
        Image Ab;
        String str = (qtd0Var == null || (C8 = qtd0Var.C8()) == null || (Ab = C8.Ab()) == null) ? null : Ab.d;
        if (qtd0Var != null) {
            com.vk.im.ui.views.avatars.b bVar = this.b;
            bVar.getClass();
            drawable = bVar.e(qtd0Var.name(), qtd0Var.t8());
        } else {
            drawable = null;
        }
        if (str == null && drawable != null) {
            return new snx.b.c(new slw(drawable), null, null, 14);
        }
        if (str == null) {
            str = "";
        }
        return new snx.b.c(new vlw(str, null), null, null, 14);
    }
}
