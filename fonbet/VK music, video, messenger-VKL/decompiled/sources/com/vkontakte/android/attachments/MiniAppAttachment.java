package com.vkontakte.android.attachments;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.NotificationImage;
import com.vk.dto.common.data.ApiApplication;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.a0a;
import xsna.bpn0;
import xsna.da70;
import xsna.epx;
import xsna.j5g;
import xsna.sv0;
import xsna.tfw;
import xsna.urd0;
import xsna.uv0;
import xsna.zcl;

/* compiled from: MiniAppAttachment.kt */
/* loaded from: classes7.dex */
public final class MiniAppAttachment extends Attachment implements tfw {
    public static final Serializer.c<MiniAppAttachment> CREATOR = new a();
    public static final bpn0 m = new bpn0(new sv0(24));
    public static final bpn0 n = new bpn0(new uv0(22));
    public final ApiApplication f;
    public final String g;
    public final String h;
    public final String i;
    public final NotificationImage j;
    public final Button k;
    public final int l = Integer.MAX_VALUE;

    /* compiled from: MiniAppAttachment.kt */
    public static abstract class Action implements Parcelable {

        /* compiled from: MiniAppAttachment.kt */
        public static final class OpenApp extends Action {
            public static final a CREATOR = new a();

            /* compiled from: MiniAppAttachment.kt */
            public static final class a implements Parcelable.Creator<OpenApp> {
                @Override // android.os.Parcelable.Creator
                public final OpenApp createFromParcel(Parcel parcel) {
                    return new OpenApp(parcel);
                }

                @Override // android.os.Parcelable.Creator
                public final OpenApp[] newArray(int i) {
                    return new OpenApp[i];
                }
            }

            public OpenApp() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public OpenApp(Parcel parcel) {
                this();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
            }
        }

        public /* synthetic */ Action(zcl zclVar) {
            this();
        }

        public Action() {
        }
    }

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<MiniAppAttachment> {
        @Override // com.vk.core.serialize.Serializer.c
        public final MiniAppAttachment a(Serializer serializer) {
            return new MiniAppAttachment((ApiApplication) serializer.G(ApiApplication.class.getClassLoader()), serializer.H(), serializer.H(), serializer.H(), (NotificationImage) serializer.G(NotificationImage.class.getClassLoader()), (Button) serializer.A(Button.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MiniAppAttachment[i];
        }
    }

    public MiniAppAttachment(ApiApplication apiApplication, String str, String str2, String str3, NotificationImage notificationImage, Button button) {
        this.f = apiApplication;
        this.g = str;
        this.h = str2;
        this.i = str3;
        this.j = notificationImage;
        this.k = button;
    }

    @Override // com.vk.dto.common.Attachment
    public final int Bb() {
        return this.l;
    }

    public final String Db() {
        return "https://" + a0a.d + "/app" + this.f.b;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.f);
        serializer.j0(this.g);
        serializer.j0(this.h);
        serializer.j0(this.i);
        serializer.i0(this.j);
        serializer.e0(this.k);
    }

    @Override // xsna.tfw
    public final String h9() {
        Object next;
        Object next2;
        int intValue = ((Number) m.getValue()).intValue();
        NotificationImage notificationImage = this.j;
        List<NotificationImage.ImageInfo> Ab = notificationImage.Ab();
        ArrayList arrayList = new ArrayList();
        for (Object obj : Ab) {
            NotificationImage.ImageInfo imageInfo = (NotificationImage.ImageInfo) obj;
            int i = imageInfo.b;
            if (i > imageInfo.c && i >= intValue) {
                arrayList.add(obj);
            }
        }
        NotificationImage.ImageInfo imageInfo2 = (NotificationImage.ImageInfo) j5g.r0(new da70(intValue), arrayList);
        if (imageInfo2 == null) {
            List<NotificationImage.ImageInfo> Ab2 = notificationImage.Ab();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : Ab2) {
                NotificationImage.ImageInfo imageInfo3 = (NotificationImage.ImageInfo) obj2;
                if (imageInfo3.b > imageInfo3.c) {
                    arrayList2.add(obj2);
                }
            }
            Iterator it = arrayList2.iterator();
            if (it.hasNext()) {
                next2 = it.next();
                if (it.hasNext()) {
                    int i2 = ((NotificationImage.ImageInfo) next2).b;
                    do {
                        Object next3 = it.next();
                        int i3 = ((NotificationImage.ImageInfo) next3).b;
                        if (i2 < i3) {
                            next2 = next3;
                            i2 = i3;
                        }
                    } while (it.hasNext());
                }
            } else {
                next2 = null;
            }
            imageInfo2 = (NotificationImage.ImageInfo) next2;
        }
        if (imageInfo2 == null && (imageInfo2 = notificationImage.Bb(((Number) n.getValue()).intValue())) == null) {
            List<NotificationImage.ImageInfo> Ab3 = notificationImage.Ab();
            ArrayList arrayList3 = new ArrayList();
            for (Object obj3 : Ab3) {
                NotificationImage.ImageInfo imageInfo4 = (NotificationImage.ImageInfo) obj3;
                if (imageInfo4.b == imageInfo4.c) {
                    arrayList3.add(obj3);
                }
            }
            Iterator it2 = arrayList3.iterator();
            if (it2.hasNext()) {
                next = it2.next();
                if (it2.hasNext()) {
                    int i4 = ((NotificationImage.ImageInfo) next).b;
                    do {
                        Object next4 = it2.next();
                        int i5 = ((NotificationImage.ImageInfo) next4).b;
                        if (i4 < i5) {
                            next = next4;
                            i4 = i5;
                        }
                    } while (it2.hasNext());
                }
            } else {
                next = null;
            }
            imageInfo2 = (NotificationImage.ImageInfo) next;
        }
        if (imageInfo2 != null) {
            return imageInfo2.d;
        }
        return null;
    }

    public final String toString() {
        return Db();
    }

    @Override // com.vk.dto.common.Attachment
    public final int zb() {
        return R.string.vk_apps_app;
    }

    /* compiled from: MiniAppAttachment.kt */
    public static final class Button implements Parcelable {
        public static final a CREATOR = new a();
        public final String b;
        public final String c;
        public final Action d;

        /* compiled from: MiniAppAttachment.kt */
        public static final class a implements Parcelable.Creator<Button> {
            @Override // android.os.Parcelable.Creator
            public final Button createFromParcel(Parcel parcel) {
                return new Button(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final Button[] newArray(int i) {
                return new Button[i];
            }
        }

        public Button(String str, String str2, Action action) {
            this.b = str;
            this.c = str2;
            this.d = action;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Button)) {
                return false;
            }
            Button button = (Button) obj;
            return epx.f(this.b, button.b) && epx.f(this.c, button.c) && epx.f(this.d, button.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + urd0.a(this.b.hashCode() * 31, 31, this.c);
        }

        public final String toString() {
            return "Button(text=" + this.b + ", state=" + this.c + ", action=" + this.d + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b);
            parcel.writeString(this.c);
            parcel.writeParcelable(this.d, i);
        }

        public Button(Parcel parcel) {
            this(parcel.readString(), parcel.readString(), (Action) parcel.readParcelable(Action.class.getClassLoader()));
        }
    }
}
