package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.app.t;
import androidx.core.graphics.drawable.IconCompat;
import defpackage.e2h0;
import defpackage.npg0;
import defpackage.szh0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes10.dex */
public final class m0 {
    public final Context a;
    public final Notification.Builder b;
    public final v c;
    public final Bundle d;
    public final int e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v4, types: [android.content.res.Resources] */
    public m0(v vVar) {
        Bundle[] bundleArr;
        ArrayList arrayList;
        int i;
        int i2;
        new ArrayList();
        this.d = new Bundle();
        this.c = vVar;
        Context context = vVar.a;
        ArrayList arrayList2 = vVar.d;
        this.a = context;
        Notification.Builder builder = new Notification.Builder(context, vVar.F);
        this.b = builder;
        Notification notification = vVar.K;
        ?? r8 = 0;
        builder.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(vVar.e).setContentText(vVar.f).setContentInfo(vVar.k).setContentIntent(vVar.h).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(vVar.i, (notification.flags & 128) != 0).setNumber(vVar.l).setProgress(0, 0, false);
        IconCompat iconCompat = vVar.j;
        builder.setLargeIcon(iconCompat == null ? null : iconCompat.i(context));
        builder.setSubText(vVar.q).setUsesChronometer(vVar.o).setPriority(vVar.m);
        t.g gVar = vVar.p;
        if (gVar instanceof t.c) {
            t.c cVar = (t.c) gVar;
            int i3 = e2h0.ic_call_decline;
            PendingIntent pendingIntent = cVar.h;
            q e = pendingIntent == null ? cVar.e(i3, szh0.call_notification_hang_up_action, npg0.call_notification_decline_color, null) : cVar.e(i3, szh0.call_notification_decline_action, npg0.call_notification_decline_color, pendingIntent);
            int i4 = e2h0.ic_call_answer;
            PendingIntent pendingIntent2 = cVar.g;
            q e2 = pendingIntent2 == null ? null : cVar.e(i4, szh0.call_notification_answer_action, npg0.call_notification_answer_color, pendingIntent2);
            ArrayList arrayList3 = new ArrayList(3);
            arrayList3.add(e);
            ArrayList arrayList4 = cVar.a.b;
            if (arrayList4 != null) {
                Iterator it = arrayList4.iterator();
                i2 = 2;
                while (it.hasNext()) {
                    q qVar = (q) it.next();
                    qVar.getClass();
                    if (!qVar.a.getBoolean("key_action_priority")) {
                        arrayList3.add(qVar);
                        i2--;
                    }
                    if (e2 != null && i2 == 1) {
                        arrayList3.add(e2);
                        i2--;
                    }
                }
            } else {
                i2 = 2;
            }
            if (e2 != null && i2 >= 1) {
                arrayList3.add(e2);
            }
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                a((q) it2.next());
            }
        } else {
            Iterator it3 = vVar.b.iterator();
            while (it3.hasNext()) {
                a((q) it3.next());
            }
        }
        Bundle bundle = vVar.y;
        if (bundle != null) {
            this.d.putAll(bundle);
        }
        this.b.setShowWhen(vVar.n);
        this.b.setLocalOnly(vVar.u);
        this.b.setGroup(vVar.r);
        this.b.setSortKey(vVar.t);
        this.b.setGroupSummary(vVar.s);
        this.e = vVar.I;
        this.b.setCategory(vVar.x);
        this.b.setColor(vVar.z);
        this.b.setVisibility(vVar.A);
        this.b.setPublicVersion(vVar.B);
        this.b.setSound(notification.sound, notification.audioAttributes);
        ArrayList arrayList5 = vVar.N;
        if (arrayList5 != null && !arrayList5.isEmpty()) {
            Iterator it4 = arrayList5.iterator();
            while (it4.hasNext()) {
                this.b.addPerson((String) it4.next());
            }
        }
        if (arrayList2.size() > 0) {
            Bundle bundle2 = vVar.c().getBundle("android.car.EXTENSIONS");
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            int i5 = 0;
            while (i5 < arrayList2.size()) {
                String num = Integer.toString(i5);
                q qVar2 = (q) arrayList2.get(i5);
                Bundle bundle5 = new Bundle();
                if (qVar2.b == null && (i = qVar2.f) != 0) {
                    qVar2.b = IconCompat.d("", r8, i);
                }
                IconCompat iconCompat2 = qVar2.b;
                Bundle bundle6 = qVar2.a;
                bundle5.putInt("icon", iconCompat2 != null ? iconCompat2.e() : 0);
                bundle5.putCharSequence("title", qVar2.g);
                bundle5.putParcelable("actionIntent", qVar2.h);
                Bundle bundle7 = bundle6 != null ? new Bundle(bundle6) : new Bundle();
                bundle7.putBoolean("android.support.allowGeneratedReplies", qVar2.d);
                bundle5.putBundle("extras", bundle7);
                z0[] z0VarArr = qVar2.c;
                if (z0VarArr == null) {
                    arrayList = arrayList2;
                    bundleArr = r8;
                } else {
                    bundleArr = new Bundle[z0VarArr.length];
                    arrayList = arrayList2;
                    int i6 = 0;
                    while (i6 < z0VarArr.length) {
                        z0 z0Var = z0VarArr[i6];
                        int i7 = i6;
                        Bundle bundle8 = new Bundle();
                        z0Var.getClass();
                        z0[] z0VarArr2 = z0VarArr;
                        Bundle[] bundleArr2 = bundleArr;
                        bundle8.putString("resultKey", "key_text_reply");
                        bundle8.putCharSequence("label", z0Var.a);
                        bundle8.putCharSequenceArray("choices", null);
                        bundle8.putBoolean("allowFreeFormInput", true);
                        bundle8.putBundle("extras", z0Var.b);
                        HashSet hashSet = z0Var.c;
                        if (!hashSet.isEmpty()) {
                            ArrayList<String> arrayList6 = new ArrayList<>(hashSet.size());
                            Iterator it5 = hashSet.iterator();
                            while (it5.hasNext()) {
                                arrayList6.add((String) it5.next());
                            }
                            bundle8.putStringArrayList("allowedDataTypes", arrayList6);
                        }
                        bundleArr2[i7] = bundle8;
                        i6 = i7 + 1;
                        z0VarArr = z0VarArr2;
                        bundleArr = bundleArr2;
                    }
                }
                bundle5.putParcelableArray("remoteInputs", bundleArr);
                bundle5.putBoolean("showsUserInterface", qVar2.e);
                bundle5.putInt("semanticAction", 0);
                bundle4.putBundle(num, bundle5);
                i5++;
                arrayList2 = arrayList;
                r8 = 0;
            }
            bundle2.putBundle("invisible_actions", bundle4);
            bundle3.putBundle("invisible_actions", bundle4);
            vVar.c().putBundle("android.car.EXTENSIONS", bundle2);
            this.d.putBundle("android.car.EXTENSIONS", bundle3);
        }
        Icon icon = vVar.M;
        if (icon != null) {
            this.b.setSmallIcon(icon);
        }
        this.b.setExtras(vVar.y);
        this.b.setRemoteInputHistory(null);
        RemoteViews remoteViews = vVar.C;
        if (remoteViews != null) {
            this.b.setCustomContentView(remoteViews);
        }
        RemoteViews remoteViews2 = vVar.D;
        if (remoteViews2 != null) {
            this.b.setCustomBigContentView(remoteViews2);
        }
        RemoteViews remoteViews3 = vVar.E;
        if (remoteViews3 != null) {
            this.b.setCustomHeadsUpContentView(remoteViews3);
        }
        this.b.setBadgeIconType(0);
        this.b.setSettingsText(null);
        this.b.setShortcutId(vVar.G);
        this.b.setTimeoutAfter(vVar.H);
        this.b.setGroupAlertBehavior(vVar.I);
        if (vVar.w) {
            this.b.setColorized(vVar.v);
        }
        if (!TextUtils.isEmpty(vVar.F)) {
            this.b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
        }
        Iterator it6 = vVar.c.iterator();
        while (it6.hasNext()) {
            this.b.addPerson(((x0) it6.next()).a());
        }
        this.b.setAllowSystemGeneratedContextualActions(vVar.J);
        this.b.setBubbleMetadata(null);
        if (Build.VERSION.SDK_INT >= 36) {
            l0.b(this.b, vVar.g);
        }
        if (vVar.L) {
            if (this.c.s) {
                this.e = 2;
            } else {
                this.e = 1;
            }
            this.b.setVibrate(null);
            this.b.setSound(null);
            int i8 = notification.defaults & (-4);
            notification.defaults = i8;
            this.b.setDefaults(i8);
            if (TextUtils.isEmpty(this.c.r)) {
                this.b.setGroup("silent");
            }
            this.b.setGroupAlertBehavior(this.e);
        }
    }

    public final void a(q qVar) {
        int i;
        if (qVar.b == null && (i = qVar.f) != 0) {
            qVar.b = IconCompat.d("", null, i);
        }
        IconCompat iconCompat = qVar.b;
        boolean z = qVar.d;
        Bundle bundle = qVar.a;
        Notification.Action.Builder builder = new Notification.Action.Builder(iconCompat != null ? iconCompat.i(null) : null, qVar.g, qVar.h);
        z0[] z0VarArr = qVar.c;
        if (z0VarArr != null) {
            RemoteInput[] remoteInputArr = new RemoteInput[z0VarArr.length];
            for (int i2 = 0; i2 < z0VarArr.length; i2++) {
                z0 z0Var = z0VarArr[i2];
                z0Var.getClass();
                RemoteInput.Builder addExtras = new RemoteInput.Builder("key_text_reply").setLabel(z0Var.a).setChoices(null).setAllowFreeFormInput(true).addExtras(z0Var.b);
                Iterator it = z0Var.c.iterator();
                while (it.hasNext()) {
                    addExtras.setAllowDataType((String) it.next(), true);
                }
                addExtras.setEditChoicesBeforeSending(0);
                remoteInputArr[i2] = addExtras.build();
            }
            for (RemoteInput remoteInput : remoteInputArr) {
                builder.addRemoteInput(remoteInput);
            }
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putBoolean("android.support.allowGeneratedReplies", z);
        builder.setAllowGeneratedReplies(z);
        bundle2.putInt("android.support.action.semanticAction", 0);
        builder.setSemanticAction(0);
        builder.setContextual(false);
        if (Build.VERSION.SDK_INT >= 31) {
            k0.a(builder);
        }
        bundle2.putBoolean("android.support.action.showsUserInterface", qVar.e);
        builder.addExtras(bundle2);
        this.b.addAction(builder.build());
    }

    public final Notification b() {
        Bundle bundle;
        v vVar = this.c;
        t.g gVar = vVar.p;
        if (gVar != null) {
            gVar.b(this);
        }
        Notification build = this.b.build();
        RemoteViews remoteViews = vVar.C;
        if (remoteViews != null) {
            build.contentView = remoteViews;
        }
        if (gVar != null) {
            vVar.p.getClass();
        }
        if (gVar != null && (bundle = build.extras) != null) {
            gVar.a(bundle);
        }
        return build;
    }
}
