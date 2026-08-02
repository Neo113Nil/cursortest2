package xsna;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.core.app.NotificationCompat;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.channels.api.ChannelHistoryOpenMode;
import com.vk.core.files.ExternalDirType;
import com.vk.dto.attaches.AttachWithDownload;
import com.vk.dto.messages.MsgIdType;
import com.vk.im.ui.components.msg_list.MsgListOpenAtMsgMode;
import com.vk.instantjobs.InstantJob;
import com.vkontakte.android.MainActivity;
import com.vkontakte.android.R;
import java.io.File;
import xsna.e3m;
import xsna.oz50;

/* compiled from: ImJobNotificationFactoryImpl.kt */
/* loaded from: classes11.dex */
public final class x8w implements w8w {
    public final Context a;

    public x8w(Context context) {
        this.a = context;
    }

    @Override // xsna.w8w
    public final String a() {
        return "sync_msg_send_channel";
    }

    @Override // xsna.w8w
    public final int b() {
        return 8;
    }

    @Override // xsna.w8w
    public final void c(NotificationCompat.h hVar) {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        ExternalDirType externalDirType = ExternalDirType.DOWNLOADS;
        com.vk.core.files.a.b.getClass();
        intent.setDataAndType(com.vk.core.files.a.N(seq.b(externalDirType)), "*/*");
        intent.addFlags(1);
        Context context = this.a;
        hVar.k(context.getString(R.string.file_download_notify_title));
        hVar.j(context.getString(R.string.file_download_notify_title));
        hVar.z(R.drawable.vk_icon_download_outline_24);
        e3m.a aVar = e3m.a;
        hVar.h(context.getColor(R.color.vk_blue_400));
        hVar.o("download_group");
        hVar.p();
        hVar.t();
        hVar.e(true);
        hVar.f(NotificationCompat.CATEGORY_SOCIAL);
        hVar.i(t2i0.a(context, 0, intent, 167772160));
        hVar.c();
    }

    @Override // xsna.w8w
    public final void d(NotificationCompat.h hVar) {
        o0w b = g2v.c().b();
        Context context = this.a;
        PendingIntent a = t2i0.a(context, 0, b.K(context), 33554432);
        hVar.z(R.drawable.vk_icon_recent_24);
        hVar.k(context.getString(R.string.push_sync_title));
        hVar.j(context.getString(R.string.push_sync_msg_send_text_unchecked));
        hVar.i(a);
    }

    @Override // xsna.w8w
    public final void e(NotificationCompat.h hVar, long j, int i, AttachWithDownload attachWithDownload, InstantJob.a aVar) {
        Intent a;
        PendingIntent a2;
        xyv a3 = g2v.c().a();
        ChannelHistoryOpenMode.OpenAtMsgByLocalId openAtMsgByLocalId = new ChannelHistoryOpenMode.OpenAtMsgByLocalId(i);
        Context context = this.a;
        a = a3.a(context, j, openAtMsgByLocalId, null, null);
        if (a == null) {
            a2 = null;
        } else {
            rsr rsrVar = oz50.k;
            oz50.b.d();
            a.setComponent(new ComponentName(context, (Class<?>) MainActivity.class));
            a.putExtra("withoutAnimation", true);
            a2 = t2i0.a(context, 0, a, 167772160);
        }
        p(hVar, a2, attachWithDownload, aVar);
    }

    @Override // xsna.w8w
    public final void f(NotificationCompat.h hVar, int i) {
        o0w b = g2v.c().b();
        Context context = this.a;
        PendingIntent a = t2i0.a(context, 0, b.K(context), 33554432);
        hVar.z(R.drawable.vk_icon_recent_24);
        hVar.k(context.getString(R.string.push_sync_title));
        hVar.j(enj.f(R.plurals.push_sync_msg_send_text_normal, i, context));
        hVar.i(a);
    }

    @Override // xsna.w8w
    public final int g() {
        return 13;
    }

    @Override // xsna.w8w
    public final String i() {
        return "download_group";
    }

    @Override // xsna.w8w
    public final String j() {
        return "downloads_group";
    }

    @Override // xsna.w8w
    public final void k() {
        x870 x870Var = x870.a;
        ca70 ca70Var = ca70.a;
        Context context = this.a;
        ((NotificationManager) context.getSystemService("notification")).createNotificationChannel(new NotificationChannel("sync_msg_send_channel", context.getString(R.string.push_sync_msg_send_channel), 2));
    }

    @Override // xsna.w8w
    public final int l() {
        return 7;
    }

    @Override // xsna.w8w
    public final void m() {
        x870 x870Var = x870.a;
        Context context = this.a;
        ca70.f(context).createNotificationChannel(new NotificationChannel("downloads_group", context.getString(R.string.notification_attachments_download_title), 3));
    }

    @Override // xsna.w8w
    public final void n(NotificationCompat.h hVar, long j, int i, AttachWithDownload attachWithDownload, InstantJob.a aVar) {
        o0w b = g2v.c().b();
        MsgListOpenAtMsgMode msgListOpenAtMsgMode = new MsgListOpenAtMsgMode(MsgIdType.LOCAL_ID, i);
        Context context = this.a;
        Intent j2 = o0w.j(b, context, null, j, null, msgListOpenAtMsgMode, null, null, null, 134217690);
        rsr rsrVar = oz50.k;
        oz50.b.d();
        j2.setComponent(new ComponentName(context, (Class<?>) MainActivity.class));
        j2.putExtra("withoutAnimation", true);
        p(hVar, t2i0.a(context, 0, j2, 167772160), attachWithDownload, aVar);
    }

    public final void o(NotificationCompat.h hVar, PendingIntent pendingIntent, AttachWithDownload attachWithDownload) {
        e3m.a aVar = e3m.a;
        Context context = this.a;
        hVar.h(context.getColor(R.color.vk_red_error));
        hVar.z(R.drawable.vk_icon_download_outline_24);
        hVar.k(context.getString(R.string.file_download_error));
        hVar.j(attachWithDownload.getFileName());
        hVar.i(pendingIntent);
        hVar.t();
        hVar.e(true);
        hVar.f(NotificationCompat.CATEGORY_SOCIAL);
        hVar.c();
    }

    public final void p(NotificationCompat.h hVar, PendingIntent pendingIntent, AttachWithDownload attachWithDownload, InstantJob.a aVar) {
        ca70 ca70Var = ca70.a;
        boolean g = ca70.g();
        boolean f = epx.f(aVar, InstantJob.a.b.a);
        Context context = this.a;
        if (!f) {
            if (epx.f(aVar, InstantJob.a.c.a)) {
                o(hVar, pendingIntent, attachWithDownload);
                return;
            }
            e3m.a aVar2 = e3m.a;
            hVar.h(context.getColor(R.color.vk_blue_400));
            hVar.z(android.R.drawable.stat_sys_download);
            hVar.k(context.getString(R.string.download_is_in_progress));
            hVar.j(attachWithDownload.getFileName());
            hVar.i(pendingIntent);
            if (g) {
                hVar.o("download_group");
            }
            if (aVar instanceof InstantJob.a.g) {
                hVar.w(1, 0, true);
            }
            if (aVar instanceof InstantJob.a.e) {
                InstantJob.a.e eVar = (InstantJob.a.e) aVar;
                hVar.w(eVar.a(), eVar.b(), false);
            }
            hVar.t();
            hVar.f(NotificationCompat.CATEGORY_PROGRESS);
            return;
        }
        File i1 = attachWithDownload.i1();
        Uri N = i1 != null ? com.vk.core.files.a.N(i1) : null;
        if (N == null || !i1.exists()) {
            o(hVar, pendingIntent, attachWithDownload);
            return;
        }
        Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL);
        intent.setDataAndType(N, com.vk.core.files.a.l(i1));
        intent.addFlags(1);
        PendingIntent a = t2i0.a(context, 0, intent, 167772160);
        e3m.a aVar3 = e3m.a;
        hVar.h(context.getColor(R.color.vk_blue_400));
        hVar.z(R.drawable.vk_icon_download_outline_24);
        hVar.k(context.getString(R.string.file_downloaded));
        hVar.j(attachWithDownload.getFileName());
        hVar.i(a);
        hVar.t();
        hVar.e(true);
        if (g) {
            hVar.o("download_group");
        }
        hVar.f(NotificationCompat.CATEGORY_SOCIAL);
        hVar.c();
    }

    @Override // xsna.w8w
    public final int h(int i) {
        return i;
    }
}
