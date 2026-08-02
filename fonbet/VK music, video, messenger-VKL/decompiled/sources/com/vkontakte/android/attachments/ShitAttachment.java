package com.vkontakte.android.attachments;

import android.os.Bundle;
import android.os.Parcel;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.ironsource.X3;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.api.generated.ads.dto.AdsItemBlockAdStatPixelDto;
import com.vk.core.serialize.Serializer;
import com.vk.dto.ads.PixelStats;
import com.vk.dto.common.AdsChoices;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VideoAdInfo;
import com.vk.dto.common.VideoAdsType;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Flags;
import com.vk.dto.newsfeed.Links;
import com.vk.dto.newsfeed.entries.DisclaimerContent;
import com.vk.dto.newsfeed.entries.PixelStatsDelegate;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.photo.Photo;
import com.vk.feed.core.models.header.EntryHeader;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.feed.core.models.news.NewsEntryWithAttachments;
import com.vk.metrics.eventtracking.Event;
import com.vk.statistic.DeprecatedStatisticInterface;
import com.vk.statistic.DeprecatedStatisticUrl;
import com.vkontakte.android.attachments.AdSource;
import com.vkontakte.android.data.b;
import defpackage.q0;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.asp;
import xsna.dqa0;
import xsna.dy2;
import xsna.ej90;
import xsna.el3;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.ms9;
import xsna.o25;
import xsna.qoy;
import xsna.shy;
import xsna.tsx0;
import xsna.u0m;
import xsna.uij0;
import xsna.uqi;
import xsna.urd0;
import xsna.wsx0;
import xsna.yg5;
import xsna.zcl;
import xsna.zrp;

/* compiled from: ShitAttachment.kt */
/* loaded from: classes7.dex */
public final class ShitAttachment extends NewsEntry implements DeprecatedStatisticInterface, b.h, dqa0, wsx0, tsx0 {
    public static final Serializer.c<ShitAttachment> CREATOR = new b();
    public final String A;
    public final String B;
    public final String C;
    public final String D;
    public final int E;
    public final String F;
    public final Image G;
    public final PhotoAttachment H;
    public final VideoAttachment I;
    public final String J;
    public final ArrayList<Card> K;
    public final ej90 L;
    public final Bundle M;
    public final NewsEntryWithAttachments.Cut N;
    public final boolean O;
    public final String P;
    public final NewsEntry.TrackData Q;
    public final UserId R;
    public final DeprecatedStatisticInterface.a S;
    public final String T;
    public final String U;
    public final boolean V;
    public final ArrayList<AdHideReason> W;
    public final AdSource X;
    public final LeadForm Y;
    public final DisclaimerData Z;
    public final PixelStatsDelegate a0;
    public final String b0;
    public final String c0;
    public final DisclaimerContent d0;
    public final Flags e0;
    public final AdsChoices f0;
    public boolean g0;
    public final Integer h0;
    public final int i;
    public final String i0;
    public final int j;
    public final Integer j0;
    public final String k;
    public final String k0;
    public final String l;
    public transient boolean l0;
    public final EntryHeader m;
    public final String n;
    public final String o;
    public final String p;
    public final String q;
    public final Links r;
    public final String s;
    public final float t;
    public final String u;
    public final String v;
    public DeprecatedStatisticUrl w;
    public final String x;
    public final String y;
    public final int z;

    /* compiled from: ShitAttachment.kt */
    public static final class LeadForm implements Serializer.StreamParcelable {
        public static final Serializer.c<LeadForm> CREATOR = new a();
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        public final List<ContactField> g;
        public final MainImage h;
        public final ResultInfo i;
        public final ArrayList<LeadFormBlock> j;
        public final boolean k;
        public final Agreement l;
        public final boolean m;

        /* compiled from: ShitAttachment.kt */
        public static final class Agreement implements Serializer.StreamParcelable {
            public static final Serializer.c<Agreement> CREATOR = new a();
            public final String b;
            public final String c;

            /* compiled from: Serializer.kt */
            public static final class a extends Serializer.c<Agreement> {
                @Override // com.vk.core.serialize.Serializer.c
                public final Agreement a(Serializer serializer) {
                    return new Agreement(serializer.H(), serializer.H());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Agreement[i];
                }
            }

            public Agreement(String str, String str2) {
                this.b = str;
                this.c = str2;
            }

            @Override // com.vk.core.serialize.Serializer.StreamParcelable
            public final void O7(Serializer serializer) {
                serializer.j0(this.b);
                serializer.j0(this.c);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Agreement)) {
                    return false;
                }
                Agreement agreement = (Agreement) obj;
                return epx.f(this.b, agreement.b) && epx.f(this.c, agreement.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + (this.b.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Agreement(url=");
                sb.append(this.b);
                sb.append(", urlTarget=");
                return ho8.a(sb, this.c, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                Serializer.StreamParcelable.a.a(this, parcel);
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ShitAttachment.kt */
        public static final class ContactField {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ ContactField[] $VALUES;
            public static final ContactField BIRTH_DATE;
            public static final ContactField CITY;
            public static final a Companion;
            public static final ContactField EMAIL;
            public static final ContactField FIRST_NAME;
            public static final ContactField PHONE;
            public static final ContactField SOCIAL_MEDIA_PROFILE;
            public static final ContactField UNSUPPORTED;
            private final String value;

            /* compiled from: ShitAttachment.kt */
            public static final class a {
            }

            static {
                ContactField contactField = new ContactField("FIRST_NAME", 0, "first_name");
                FIRST_NAME = contactField;
                ContactField contactField2 = new ContactField(CommonConstant.RETKEY.EMAIL, 1, "email");
                EMAIL = contactField2;
                ContactField contactField3 = new ContactField("PHONE", 2, "phone");
                PHONE = contactField3;
                ContactField contactField4 = new ContactField("BIRTH_DATE", 3, "birth_date");
                BIRTH_DATE = contactField4;
                ContactField contactField5 = new ContactField("CITY", 4, "city");
                CITY = contactField5;
                ContactField contactField6 = new ContactField("SOCIAL_MEDIA_PROFILE", 5, "social_media_profile");
                SOCIAL_MEDIA_PROFILE = contactField6;
                ContactField contactField7 = new ContactField("UNSUPPORTED", 6, "");
                UNSUPPORTED = contactField7;
                ContactField[] contactFieldArr = {contactField, contactField2, contactField3, contactField4, contactField5, contactField6, contactField7};
                $VALUES = contactFieldArr;
                $ENTRIES = new asp(contactFieldArr);
                Companion = new a();
            }

            public ContactField(String str, int i, String str2) {
                this.value = str2;
            }

            public static ContactField valueOf(String str) {
                return (ContactField) Enum.valueOf(ContactField.class, str);
            }

            public static ContactField[] values() {
                return (ContactField[]) $VALUES.clone();
            }

            public final String h() {
                return this.value;
            }
        }

        /* compiled from: ShitAttachment.kt */
        public static final class LeadFormBlock implements Serializer.StreamParcelable {
            public static final Serializer.c<LeadFormBlock> CREATOR = new a();
            public final String b;
            public final String c;
            public final Type d;
            public final List<Answer> e;

            /* compiled from: ShitAttachment.kt */
            public static final class Answer implements Serializer.StreamParcelable {
                public static final Serializer.c<Answer> CREATOR = new a();
                public final String b;
                public final String c;

                /* compiled from: Serializer.kt */
                public static final class a extends Serializer.c<Answer> {
                    @Override // com.vk.core.serialize.Serializer.c
                    public final Answer a(Serializer serializer) {
                        return new Answer(serializer.H(), serializer.H());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new Answer[i];
                    }
                }

                public Answer(String str, String str2) {
                    this.b = str;
                    this.c = str2;
                }

                @Override // com.vk.core.serialize.Serializer.StreamParcelable
                public final void O7(Serializer serializer) {
                    serializer.j0(this.b);
                    serializer.j0(this.c);
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Answer)) {
                        return false;
                    }
                    Answer answer = (Answer) obj;
                    return epx.f(this.b, answer.b) && epx.f(this.c, answer.c);
                }

                public final int hashCode() {
                    return this.c.hashCode() + (this.b.hashCode() * 31);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("Answer(id=");
                    sb.append(this.b);
                    sb.append(", text=");
                    return ho8.a(sb, this.c, ')');
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    Serializer.StreamParcelable.a.a(this, parcel);
                }
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: ShitAttachment.kt */
            public static final class Type {
                private static final /* synthetic */ zrp $ENTRIES;
                private static final /* synthetic */ Type[] $VALUES;
                public static final a Companion;
                public static final Type MULTIPLE_ANSWERS;
                public static final Type ONE_ANSWER;
                public static final Type TEXT_ANSWER;
                public static final Type UNSUPPORTED;
                private final String value;

                /* compiled from: ShitAttachment.kt */
                public static final class a {
                }

                static {
                    Type type = new Type("ONE_ANSWER", 0, "one_answer");
                    ONE_ANSWER = type;
                    Type type2 = new Type("MULTIPLE_ANSWERS", 1, "multiple_answers");
                    MULTIPLE_ANSWERS = type2;
                    Type type3 = new Type("TEXT_ANSWER", 2, "text_answer");
                    TEXT_ANSWER = type3;
                    Type type4 = new Type("UNSUPPORTED", 3, "");
                    UNSUPPORTED = type4;
                    Type[] typeArr = {type, type2, type3, type4};
                    $VALUES = typeArr;
                    $ENTRIES = new asp(typeArr);
                    Companion = new a();
                }

                public Type(String str, int i, String str2) {
                    this.value = str2;
                }

                public static Type valueOf(String str) {
                    return (Type) Enum.valueOf(Type.class, str);
                }

                public static Type[] values() {
                    return (Type[]) $VALUES.clone();
                }

                public final String h() {
                    return this.value;
                }
            }

            /* compiled from: Serializer.kt */
            public static final class a extends Serializer.c<LeadFormBlock> {
                @Override // com.vk.core.serialize.Serializer.c
                public final LeadFormBlock a(Serializer serializer) {
                    return new LeadFormBlock(serializer.H(), serializer.H(), (Type) serializer.C(), serializer.j(Answer.CREATOR));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new LeadFormBlock[i];
                }
            }

            public LeadFormBlock(String str, String str2, Type type, List<Answer> list) {
                this.b = str;
                this.c = str2;
                this.d = type;
                this.e = list;
            }

            @Override // com.vk.core.serialize.Serializer.StreamParcelable
            public final void O7(Serializer serializer) {
                serializer.j0(this.b);
                serializer.j0(this.c);
                serializer.g0(this.d);
                serializer.o0(this.e);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof LeadFormBlock)) {
                    return false;
                }
                LeadFormBlock leadFormBlock = (LeadFormBlock) obj;
                return epx.f(this.b, leadFormBlock.b) && epx.f(this.c, leadFormBlock.c) && this.d == leadFormBlock.d && epx.f(this.e, leadFormBlock.e);
            }

            public final int hashCode() {
                return this.e.hashCode() + ((this.d.hashCode() + urd0.a(this.b.hashCode() * 31, 31, this.c)) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("LeadFormBlock(id=");
                sb.append(this.b);
                sb.append(", text=");
                sb.append(this.c);
                sb.append(", type=");
                sb.append(this.d);
                sb.append(", answers=");
                return ms9.a(')', sb, this.e);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                Serializer.StreamParcelable.a.a(this, parcel);
            }
        }

        /* compiled from: ShitAttachment.kt */
        public static final class MainImage implements Serializer.StreamParcelable {
            public static final Serializer.c<MainImage> CREATOR = new a();
            public final String b;
            public final String c;
            public final String d;

            /* compiled from: Serializer.kt */
            public static final class a extends Serializer.c<MainImage> {
                @Override // com.vk.core.serialize.Serializer.c
                public final MainImage a(Serializer serializer) {
                    return new MainImage(serializer.H(), serializer.H(), serializer.H());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new MainImage[i];
                }
            }

            public MainImage(String str, String str2, String str3) {
                this.b = str;
                this.c = str2;
                this.d = str3;
            }

            @Override // com.vk.core.serialize.Serializer.StreamParcelable
            public final void O7(Serializer serializer) {
                serializer.j0(this.b);
                serializer.j0(this.c);
                serializer.j0(this.d);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof MainImage)) {
                    return false;
                }
                MainImage mainImage = (MainImage) obj;
                return epx.f(this.b, mainImage.b) && epx.f(this.c, mainImage.c) && epx.f(this.d, mainImage.d);
            }

            public final int hashCode() {
                return this.d.hashCode() + urd0.a(this.b.hashCode() * 31, 31, this.c);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("MainImage(image1080=");
                sb.append(this.b);
                sb.append(", image480=");
                sb.append(this.c);
                sb.append(", image320=");
                return ho8.a(sb, this.d, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                Serializer.StreamParcelable.a.a(this, parcel);
            }
        }

        /* compiled from: ShitAttachment.kt */
        public static final class ResultInfo implements Serializer.StreamParcelable {
            public static final Serializer.c<ResultInfo> CREATOR = new a();
            public final String b;
            public final String c;
            public final String d;
            public final String e;
            public final String f;
            public final String g;
            public final String h;

            /* compiled from: Serializer.kt */
            public static final class a extends Serializer.c<ResultInfo> {
                @Override // com.vk.core.serialize.Serializer.c
                public final ResultInfo a(Serializer serializer) {
                    return new ResultInfo(serializer.H(), serializer.H(), serializer.H(), serializer.H(), serializer.H(), serializer.H(), serializer.H());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new ResultInfo[i];
                }
            }

            public ResultInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
                this.b = str;
                this.c = str2;
                this.d = str3;
                this.e = str4;
                this.f = str5;
                this.g = str6;
                this.h = str7;
            }

            @Override // com.vk.core.serialize.Serializer.StreamParcelable
            public final void O7(Serializer serializer) {
                serializer.j0(this.b);
                serializer.j0(this.c);
                serializer.j0(this.d);
                serializer.j0(this.e);
                serializer.j0(this.f);
                serializer.j0(this.g);
                serializer.j0(this.h);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ResultInfo)) {
                    return false;
                }
                ResultInfo resultInfo = (ResultInfo) obj;
                return epx.f(this.b, resultInfo.b) && epx.f(this.c, resultInfo.c) && epx.f(this.d, resultInfo.d) && epx.f(this.e, resultInfo.e) && epx.f(this.f, resultInfo.f) && epx.f(this.g, resultInfo.g) && epx.f(this.h, resultInfo.h);
            }

            public final int hashCode() {
                int hashCode = this.b.hashCode() * 31;
                String str = this.c;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.d;
                int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.e;
                int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.f;
                int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
                String str5 = this.g;
                return this.h.hashCode() + ((hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("ResultInfo(title=");
                sb.append(this.b);
                sb.append(", description=");
                sb.append(this.c);
                sb.append(", siteUrl=");
                sb.append(this.d);
                sb.append(", siteUrlTarget=");
                sb.append(this.e);
                sb.append(", phone=");
                sb.append(this.f);
                sb.append(", promoCode=");
                sb.append(this.g);
                sb.append(", buttonText=");
                return ho8.a(sb, this.h, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                Serializer.StreamParcelable.a.a(this, parcel);
            }
        }

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<LeadForm> {
            @Override // com.vk.core.serialize.Serializer.c
            public final LeadForm a(Serializer serializer) {
                return new LeadForm(serializer.H(), serializer.H(), serializer.H(), serializer.H(), serializer.H(), serializer.D(), (MainImage) serializer.G(MainImage.class.getClassLoader()), (ResultInfo) serializer.G(ResultInfo.class.getClassLoader()), serializer.j(LeadFormBlock.CREATOR), serializer.m(), (Agreement) serializer.G(Agreement.class.getClassLoader()), serializer.m());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LeadForm[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public LeadForm(String str, String str2, String str3, String str4, String str5, List<? extends ContactField> list, MainImage mainImage, ResultInfo resultInfo, ArrayList<LeadFormBlock> arrayList, boolean z, Agreement agreement, boolean z2) {
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = str5;
            this.g = list;
            this.h = mainImage;
            this.i = resultInfo;
            this.j = arrayList;
            this.k = z;
            this.l = agreement;
            this.m = z2;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.b);
            serializer.j0(this.c);
            serializer.j0(this.d);
            serializer.j0(this.e);
            serializer.j0(this.f);
            serializer.h0(this.g);
            serializer.i0(this.h);
            serializer.i0(this.i);
            serializer.o0(this.j);
            serializer.L(this.k ? (byte) 1 : (byte) 0);
            serializer.i0(this.l);
            serializer.L(this.m ? (byte) 1 : (byte) 0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LeadForm)) {
                return false;
            }
            LeadForm leadForm = (LeadForm) obj;
            return epx.f(this.b, leadForm.b) && epx.f(this.c, leadForm.c) && epx.f(this.d, leadForm.d) && epx.f(this.e, leadForm.e) && epx.f(this.f, leadForm.f) && epx.f(this.g, leadForm.g) && epx.f(this.h, leadForm.h) && epx.f(this.i, leadForm.i) && epx.f(this.j, leadForm.j) && this.k == leadForm.k && epx.f(this.l, leadForm.l) && this.m == leadForm.m;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.m) + ((this.l.hashCode() + qoy.b((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + fw3.a(urd0.a(urd0.a(urd0.a(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g)) * 31)) * 31)) * 31, 31, this.k)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("LeadForm(data=");
            sb.append(this.b);
            sb.append(", formId=");
            sb.append(this.c);
            sb.append(", globalFormId=");
            sb.append(this.d);
            sb.append(", title=");
            sb.append(this.e);
            sb.append(", description=");
            sb.append(this.f);
            sb.append(", contactFields=");
            sb.append(this.g);
            sb.append(", mainImage=");
            sb.append(this.h);
            sb.append(", resultInfo=");
            sb.append(this.i);
            sb.append(", blocks=");
            sb.append(this.j);
            sb.append(", isFilledPreviously=");
            sb.append(this.k);
            sb.append(", agreement=");
            sb.append(this.l);
            sb.append(", isAnswersRequired=");
            return q0.a(sb, this.m, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            Serializer.StreamParcelable.a.a(this, parcel);
        }
    }

    /* compiled from: ShitAttachment.kt */
    public static final class a {
        public static void a(DeprecatedStatisticInterface deprecatedStatisticInterface, yg5 yg5Var) {
            yg5Var.F0();
            try {
                ((u0m) yg5Var).Q0(deprecatedStatisticInterface.R6("playback_started"));
            } catch (ClassCastException e) {
                com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
                el3 el3Var = Event.b;
                Event.a aVar = new Event.a();
                aVar.g("deprecated_statistic_cast_exception");
                aVar.i("FirebaseTracker");
                bVar.k(aVar.e());
                bVar.a(e);
            }
            List<DeprecatedStatisticUrl> R6 = deprecatedStatisticInterface.R6("playback_completed");
            if (!R6.isEmpty()) {
                try {
                    ((u0m) yg5Var).Q0(R6);
                } catch (ClassCastException e2) {
                    com.vk.metrics.eventtracking.b bVar2 = com.vk.metrics.eventtracking.b.a;
                    el3 el3Var2 = Event.b;
                    Event.a aVar2 = new Event.a();
                    aVar2.g("deprecated_statistic_cast_exception");
                    aVar2.i("FirebaseTracker");
                    bVar2.k(aVar2.e());
                    bVar2.a(e2);
                }
                deprecatedStatisticInterface.x4("video_play_100");
            }
            List<DeprecatedStatisticUrl> R62 = deprecatedStatisticInterface.R6("playhead_reached_value");
            if (!R62.isEmpty()) {
                try {
                    ((u0m) yg5Var).Q0(R62);
                } catch (ClassCastException e3) {
                    com.vk.metrics.eventtracking.b bVar3 = com.vk.metrics.eventtracking.b.a;
                    el3 el3Var3 = Event.b;
                    Event.a aVar3 = new Event.a();
                    aVar3.g("deprecated_statistic_cast_exception");
                    aVar3.i("FirebaseTracker");
                    bVar3.k(aVar3.e());
                    bVar3.a(e3);
                }
                deprecatedStatisticInterface.x4("video_play_3s");
                deprecatedStatisticInterface.x4("video_play_10s");
                deprecatedStatisticInterface.x4("video_play_25");
                deprecatedStatisticInterface.x4("video_play_50");
                deprecatedStatisticInterface.x4("video_play_75");
                deprecatedStatisticInterface.x4("video_play_95");
                deprecatedStatisticInterface.x4("video_play_100");
            }
            try {
                u0m u0mVar = (u0m) yg5Var;
                u0mVar.Q0(deprecatedStatisticInterface.R6("playhead_viewability_value"));
                u0mVar.Q0(deprecatedStatisticInterface.R6("volume_on"));
                u0mVar.Q0(deprecatedStatisticInterface.R6("volume_off"));
                u0mVar.Q0(deprecatedStatisticInterface.R6("video_fullscreen_on"));
                u0mVar.Q0(deprecatedStatisticInterface.R6("video_fullscreen_off"));
                u0mVar.Q0(deprecatedStatisticInterface.R6("playback_paused"));
                u0mVar.Q0(deprecatedStatisticInterface.R6("playback_resumed"));
                u0mVar.Q0(deprecatedStatisticInterface.R6("error"));
            } catch (ClassCastException e4) {
                com.vk.metrics.eventtracking.b bVar4 = com.vk.metrics.eventtracking.b.a;
                el3 el3Var4 = Event.b;
                Event.a aVar4 = new Event.a();
                aVar4.g("deprecated_statistic_cast_exception");
                aVar4.i("FirebaseTracker");
                bVar4.k(aVar4.e());
                bVar4.a(e4);
            }
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<ShitAttachment> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ShitAttachment a(Serializer serializer) {
            int u = serializer.u();
            int u2 = serializer.u();
            String H = serializer.H();
            String H2 = serializer.H();
            EntryHeader entryHeader = (EntryHeader) serializer.G(EntryHeader.class.getClassLoader());
            String H3 = serializer.H();
            String H4 = serializer.H();
            String H5 = serializer.H();
            String H6 = serializer.H();
            Links links = (Links) serializer.G(Links.class.getClassLoader());
            String H7 = serializer.H();
            float s = serializer.s();
            String H8 = serializer.H();
            String H9 = serializer.H();
            DeprecatedStatisticUrl deprecatedStatisticUrl = (DeprecatedStatisticUrl) serializer.G(DeprecatedStatisticUrl.class.getClassLoader());
            String H10 = serializer.H();
            String H11 = serializer.H();
            int u3 = serializer.u();
            String H12 = serializer.H();
            String H13 = serializer.H();
            String H14 = serializer.H();
            String H15 = serializer.H();
            int u4 = serializer.u();
            String H16 = serializer.H();
            Image image = (Image) serializer.G(Image.class.getClassLoader());
            PhotoAttachment photoAttachment = (PhotoAttachment) serializer.G(PhotoAttachment.class.getClassLoader());
            VideoAttachment videoAttachment = (VideoAttachment) serializer.G(VideoAttachment.class.getClassLoader());
            String H17 = serializer.H();
            ArrayList j = serializer.j(Card.CREATOR);
            Bundle o = serializer.o(Post.class.getClassLoader());
            NewsEntryWithAttachments.Cut cut = (NewsEntryWithAttachments.Cut) serializer.G(NewsEntryWithAttachments.Cut.class.getClassLoader());
            boolean m = serializer.m();
            String H18 = serializer.H();
            NewsEntry.TrackData trackData = (NewsEntry.TrackData) serializer.G(NewsEntry.TrackData.class.getClassLoader());
            UserId userId = (UserId) serializer.A(UserId.class.getClassLoader());
            DeprecatedStatisticInterface.a aVar = new DeprecatedStatisticInterface.a();
            aVar.d(serializer);
            String H19 = serializer.H();
            String H20 = serializer.H();
            ej90.b bVar = new ej90.b(o, cut.d, uij0.c.a, o25.a().i().U, null, 0, 0, null, null, 496);
            ej90.c cVar = new ej90.c(0);
            ej90 a = ej90.a.a(H12, bVar, cVar);
            boolean z = cVar.a;
            ArrayList j2 = serializer.j(AdHideReason.CREATOR);
            AdSource.a aVar2 = AdSource.Companion;
            String H21 = serializer.H();
            aVar2.getClass();
            AdSource a2 = AdSource.a.a(H21);
            DisclaimerData disclaimerData = (DisclaimerData) serializer.G(DisclaimerData.class.getClassLoader());
            PixelStatsDelegate pixelStatsDelegate = (PixelStatsDelegate) serializer.G(PixelStatsDelegate.class.getClassLoader());
            if (pixelStatsDelegate == null) {
                pixelStatsDelegate = new PixelStatsDelegate();
            }
            String H22 = serializer.H();
            String H23 = serializer.H();
            DisclaimerContent disclaimerContent = (DisclaimerContent) serializer.C();
            if (disclaimerContent == null) {
                disclaimerContent = DisclaimerContent.UNSUPPORTED;
            }
            DisclaimerContent disclaimerContent2 = disclaimerContent;
            ShitAttachment shitAttachment = new ShitAttachment(u, u2, H, H2, entryHeader, H3, H4, H5, H6, links, H7, s, H8, H9, deprecatedStatisticUrl, H10, H11, u3, H12, H13, H14, H15, u4, H16, image, photoAttachment, videoAttachment, H17, j, a, o, cut, m, H18, trackData, userId, aVar, H19, H20, z, j2, a2, (LeadForm) serializer.G(LeadForm.class.getClassLoader()), disclaimerData, pixelStatsDelegate, H22, H23, disclaimerContent2, (Flags) serializer.G(Flags.class.getClassLoader()), (AdsChoices) serializer.G(AdsChoices.class.getClassLoader()), serializer.m(), serializer.v(), serializer.H(), serializer.v(), serializer.H());
            if (videoAttachment != null) {
                videoAttachment.Mb(shitAttachment);
            }
            if (videoAttachment != null) {
                videoAttachment.o = shitAttachment;
            }
            if (videoAttachment != null) {
                videoAttachment.b = true;
            }
            if (photoAttachment != null) {
                photoAttachment.b = true;
            }
            shitAttachment.l0 = dy2.i(shitAttachment.x);
            return shitAttachment;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ShitAttachment[i];
        }
    }

    public /* synthetic */ ShitAttachment(int i, int i2, String str, String str2, EntryHeader entryHeader, String str3, String str4, String str5, String str6, Links links, String str7, float f, String str8, String str9, DeprecatedStatisticUrl deprecatedStatisticUrl, String str10, String str11, int i3, String str12, String str13, String str14, String str15, int i4, String str16, Image image, PhotoAttachment photoAttachment, VideoAttachment videoAttachment, String str17, ArrayList arrayList, ej90 ej90Var, Bundle bundle, NewsEntryWithAttachments.Cut cut, boolean z, String str18, NewsEntry.TrackData trackData, UserId userId, DeprecatedStatisticInterface.a aVar, String str19, String str20, boolean z2, ArrayList arrayList2, AdSource adSource, LeadForm leadForm, DisclaimerData disclaimerData, PixelStatsDelegate pixelStatsDelegate, String str21, String str22, DisclaimerContent disclaimerContent, Flags flags, AdsChoices adsChoices, boolean z3, Integer num, String str23, Integer num2, String str24, int i5, int i6, zcl zclVar) {
        this(i, i2, str, str2, entryHeader, str3, str4, str5, str6, links, str7, f, str8, str9, deprecatedStatisticUrl, str10, str11, i3, str12, str13, str14, str15, i4, str16, image, photoAttachment, videoAttachment, str17, arrayList, ej90Var, bundle, cut, z, str18, trackData, userId, (i6 & 16) != 0 ? new DeprecatedStatisticInterface.a() : aVar, str19, str20, z2, arrayList2, adSource, leadForm, (i6 & 2048) != 0 ? null : disclaimerData, (i6 & 4096) != 0 ? new PixelStatsDelegate() : pixelStatsDelegate, (i6 & 8192) != 0 ? null : str21, (i6 & 16384) != 0 ? null : str22, (32768 & i6) != 0 ? DisclaimerContent.UNSUPPORTED : disclaimerContent, (65536 & i6) != 0 ? new Flags(0L, 1, null) : flags, adsChoices, (i6 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? false : z3, num, str23, num2, str24);
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final String Ab() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.i);
        sb.append('_');
        sb.append(this.j);
        return sb.toString();
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final String Bb() {
        return Ab();
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final NewsEntry.TrackData Cb() {
        return this.Q;
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final String Db() {
        return com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS;
    }

    public final String Eb() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.j);
        sb.append('_');
        sb.append(this.i);
        return sb.toString();
    }

    @Override // xsna.dqa0
    public final void F7(PixelStats pixelStats) {
        this.a0.F7(pixelStats);
    }

    public final String Fb() {
        return this.v;
    }

    public final boolean Gb() {
        VideoFile videoFile;
        VideoAdInfo X0;
        VideoAttachment videoAttachment = this.I;
        return ((videoAttachment == null || (videoFile = videoAttachment.k) == null || (X0 = videoFile.X0()) == null) ? null : X0.h) == VideoAdsType.MAIL_PROMOTED_SHORT_VIDEO;
    }

    public final boolean Hb() {
        VideoFile videoFile;
        VideoAdInfo X0;
        VideoAttachment videoAttachment = this.I;
        return epx.f((videoAttachment == null || (videoFile = videoAttachment.k) == null || (X0 = videoFile.X0()) == null) ? null : X0.l, X3.i.D) && !Gb();
    }

    public final void Ib() {
        DeprecatedStatisticInterface.a aVar = this.S;
        Iterator it = aVar.b("load").iterator();
        while (it.hasNext()) {
            com.vkontakte.android.data.b.p((DeprecatedStatisticUrl) it.next());
        }
        Iterator it2 = aVar.b("viewability_measurable").iterator();
        while (it2.hasNext()) {
            com.vkontakte.android.data.b.p((DeprecatedStatisticUrl) it2.next());
        }
        Iterator it3 = aVar.b("render").iterator();
        while (it3.hasNext()) {
            com.vkontakte.android.data.b.p((DeprecatedStatisticUrl) it3.next());
        }
        ArrayList<Card> arrayList = this.K;
        if (arrayList != null) {
            Iterator<T> it4 = arrayList.iterator();
            while (it4.hasNext()) {
                DeprecatedStatisticInterface.a aVar2 = ((Card) it4.next()).p;
                Iterator it5 = aVar2.b("load").iterator();
                while (it5.hasNext()) {
                    com.vkontakte.android.data.b.p((DeprecatedStatisticUrl) it5.next());
                }
                Iterator it6 = aVar2.b("viewability_measurable").iterator();
                while (it6.hasNext()) {
                    com.vkontakte.android.data.b.p((DeprecatedStatisticUrl) it6.next());
                }
                Iterator it7 = aVar2.b("render").iterator();
                while (it7.hasNext()) {
                    com.vkontakte.android.data.b.p((DeprecatedStatisticUrl) it7.next());
                }
            }
        }
    }

    @Override // xsna.tsx0
    public final DisclaimerData N3() {
        return this.Z;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.i);
        serializer.S(this.j);
        serializer.j0(this.k);
        serializer.j0(this.l);
        serializer.i0(this.m);
        serializer.j0(this.n);
        serializer.j0(this.o);
        serializer.j0(this.p);
        serializer.j0(this.q);
        serializer.i0(this.r);
        serializer.j0(this.s);
        serializer.P(this.t);
        serializer.j0(this.u);
        serializer.j0(this.v);
        serializer.i0(this.w);
        serializer.j0(this.x);
        serializer.j0(this.y);
        serializer.S(this.z);
        serializer.j0(this.A);
        serializer.j0(this.B);
        serializer.j0(this.C);
        serializer.j0(this.D);
        serializer.S(this.E);
        serializer.j0(this.F);
        serializer.i0(this.G);
        serializer.i0(this.H);
        serializer.i0(this.I);
        serializer.j0(this.J);
        serializer.o0(this.K);
        serializer.K(this.M);
        serializer.i0(this.N);
        serializer.L(this.O ? (byte) 1 : (byte) 0);
        serializer.j0(this.P);
        serializer.i0(this.Q);
        serializer.e0(this.R);
        this.S.e(serializer);
        serializer.j0(this.T);
        serializer.j0(this.U);
        serializer.o0(this.W);
        AdSource adSource = this.X;
        serializer.j0(adSource != null ? adSource.h() : null);
        serializer.i0(this.Z);
        serializer.i0(this.a0);
        serializer.j0(this.b0);
        serializer.j0(this.c0);
        serializer.g0(this.d0);
        serializer.i0(this.e0);
        serializer.L(this.g0 ? (byte) 1 : (byte) 0);
        serializer.i0(this.Y);
        serializer.i0(this.f0);
        serializer.V(this.h0);
        serializer.j0(this.i0);
        serializer.V(this.j0);
        serializer.j0(this.k0);
    }

    @Override // com.vk.statistic.DeprecatedStatisticInterface
    public final List<DeprecatedStatisticUrl> R6(String str) {
        return this.S.b(str);
    }

    @Override // com.vkontakte.android.data.b.h
    public final DeprecatedStatisticUrl T6() {
        return this.w;
    }

    @Override // com.vk.statistic.DeprecatedStatisticInterface
    public final int Wa() {
        return this.S.hashCode();
    }

    @Override // com.vk.statistic.DeprecatedStatisticInterface
    public final int Y7(String str) {
        return this.S.c(str);
    }

    @Override // xsna.dqa0
    public final int b6(AdsItemBlockAdStatPixelDto.TypeDto typeDto) {
        return this.a0.b6(typeDto);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ShitAttachment) {
            ShitAttachment shitAttachment = (ShitAttachment) obj;
            if (this.i == shitAttachment.i && this.j == shitAttachment.j) {
                return true;
            }
        }
        return false;
    }

    @Override // xsna.tsx0
    public final DisclaimerContent getContentType() {
        return this.d0;
    }

    @Override // xsna.wsx0
    public final EntryHeader getHeader() {
        return this.m;
    }

    @Override // com.vk.statistic.DeprecatedStatisticInterface
    public final void h(DeprecatedStatisticUrl deprecatedStatisticUrl) {
        this.S.a(deprecatedStatisticUrl);
    }

    public final int hashCode() {
        return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.i) * 31) + this.j;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShitAttachment(adsId1=");
        sb.append(this.i);
        sb.append(", adsId2=");
        sb.append(this.j);
        sb.append(", type=");
        sb.append(this.k);
        sb.append(", title=");
        sb.append(this.l);
        sb.append(", header=");
        sb.append(this.m);
        sb.append(", followers=");
        sb.append(this.n);
        sb.append(", siteDescription=");
        sb.append(this.o);
        sb.append(", buttonText=");
        sb.append(this.p);
        sb.append(", link=");
        sb.append(this.q);
        sb.append(", links=");
        sb.append(this.r);
        sb.append(", linkType=");
        sb.append(this.s);
        sb.append(", rating=");
        sb.append(this.t);
        sb.append(", buttonTextInstalled=");
        sb.append(this.u);
        sb.append(", data=");
        sb.append(this.v);
        sb.append(", dataImpression=");
        sb.append(this.w);
        sb.append(", appPackage=");
        sb.append(this.x);
        sb.append(", deepLink=");
        sb.append(this.y);
        sb.append(", linkTarget=");
        sb.append(this.z);
        sb.append(", text=");
        sb.append(this.A);
        sb.append(", disclaimer=");
        sb.append(this.B);
        sb.append(", genre=");
        sb.append(this.C);
        sb.append(", domain=");
        sb.append(this.D);
        sb.append(", timeToLive=");
        sb.append(this.E);
        sb.append(", userName=");
        sb.append(this.F);
        sb.append(", photoIcon=");
        sb.append(this.G);
        sb.append(", photo=");
        sb.append(this.H);
        sb.append(", video=");
        sb.append(this.I);
        sb.append(", ageRestriction=");
        sb.append(this.J);
        sb.append(", cards=");
        sb.append(this.K);
        sb.append(", parsedText=");
        sb.append(this.L);
        sb.append(", awayParams=");
        sb.append(this.M);
        sb.append(", cut=");
        sb.append(this.N);
        sb.append(", isClickable=");
        sb.append(this.O);
        sb.append(", debugData=");
        sb.append(this.P);
        sb.append(", trackData=");
        sb.append(this.Q);
        sb.append(", uid=");
        sb.append(this.R);
        sb.append(", statistics=");
        sb.append(this.S);
        sb.append(", advertiserInfoUrl=");
        sb.append(this.T);
        sb.append(", adMarker=");
        sb.append(this.U);
        sb.append(", hasObsceneText=");
        sb.append(this.V);
        sb.append(", hideReasons=");
        sb.append(this.W);
        sb.append(", adSource=");
        sb.append(this.X);
        sb.append(", leadForm=");
        sb.append(this.Y);
        sb.append(", disclaimerData=");
        sb.append(this.Z);
        sb.append(", pixelStatsDelegate=");
        sb.append(this.a0);
        sb.append(", recommendationInfoUrl=");
        sb.append(this.b0);
        sb.append(", adsUrl=");
        sb.append(this.c0);
        sb.append(", contentType=");
        sb.append(this.d0);
        sb.append(", flags=");
        sb.append(this.e0);
        sb.append(", adsChoices=");
        sb.append(this.f0);
        sb.append(", suggestSubscribe=");
        sb.append(this.g0);
        sb.append(", clickAreaBitmask=");
        sb.append(this.h0);
        sb.append(", ctaLink=");
        sb.append(this.i0);
        sb.append(", ctaLinkTarget=");
        sb.append(this.j0);
        sb.append(", ctaLinkType=");
        return ho8.a(sb, this.k0, ')');
    }

    @Override // xsna.dqa0
    public final List<PixelStats> u6(AdsItemBlockAdStatPixelDto.TypeDto typeDto) {
        return this.a0.u6(typeDto);
    }

    @Override // com.vk.statistic.DeprecatedStatisticInterface
    public final void x4(String str) {
        this.S.a.remove(str);
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final int zb() {
        return 11;
    }

    /* compiled from: ShitAttachment.kt */
    public static final class Card extends Serializer.StreamParcelableAdapter implements DeprecatedStatisticInterface, dqa0 {
        public static final Serializer.c<Card> CREATOR = new a();
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        public final String g;
        public final String h;
        public final String i;
        public final float j;
        public final int k;
        public final PhotoAttachment l;
        public final String m;
        public final String n;
        public final String o;
        public final DeprecatedStatisticInterface.a p;
        public final PixelStatsDelegate q;
        public final boolean r;
        public final Integer s;
        public String t;
        public transient boolean u;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Card> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Card a(Serializer serializer) {
                String H = serializer.H();
                String H2 = serializer.H();
                String H3 = serializer.H();
                String H4 = serializer.H();
                String H5 = serializer.H();
                String H6 = serializer.H();
                String H7 = serializer.H();
                String H8 = serializer.H();
                float s = serializer.s();
                int u = serializer.u();
                PhotoAttachment photoAttachment = (PhotoAttachment) serializer.G(PhotoAttachment.class.getClassLoader());
                String H9 = serializer.H();
                String H10 = serializer.H();
                String H11 = serializer.H();
                PixelStatsDelegate pixelStatsDelegate = (PixelStatsDelegate) serializer.G(PixelStatsDelegate.class.getClassLoader());
                if (pixelStatsDelegate == null) {
                    pixelStatsDelegate = new PixelStatsDelegate();
                }
                PixelStatsDelegate pixelStatsDelegate2 = pixelStatsDelegate;
                Card card = new Card(H, H2, H3, H4, H5, H6, H7, H8, s, u, photoAttachment, H9, H10, H11, null, pixelStatsDelegate2, false, serializer.v(), 81920, null);
                card.t = serializer.H();
                card.p.d(serializer);
                Serializer.c<ShitAttachment> cVar = ShitAttachment.CREATOR;
                card.u = dy2.i(card.e);
                return card;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Card[i];
            }
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Card(java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, float r30, int r31, com.vkontakte.android.attachments.PhotoAttachment r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, com.vk.statistic.DeprecatedStatisticInterface.a r36, com.vk.dto.newsfeed.entries.PixelStatsDelegate r37, boolean r38, java.lang.Integer r39, int r40, xsna.zcl r41) {
            /*
                r21 = this;
                r0 = r40
                r1 = r0 & 256(0x100, float:3.59E-43)
                if (r1 == 0) goto L9
                r1 = 0
                r11 = r1
                goto Lb
            L9:
                r11 = r30
            Lb:
                r1 = r0 & 512(0x200, float:7.17E-43)
                r2 = 0
                if (r1 == 0) goto L12
                r12 = r2
                goto L14
            L12:
                r12 = r31
            L14:
                r1 = r0 & 16384(0x4000, float:2.2959E-41)
                if (r1 == 0) goto L20
                com.vk.statistic.DeprecatedStatisticInterface$a r1 = new com.vk.statistic.DeprecatedStatisticInterface$a
                r1.<init>()
                r17 = r1
                goto L22
            L20:
                r17 = r36
            L22:
                r1 = 32768(0x8000, float:4.5918E-41)
                r1 = r1 & r0
                if (r1 == 0) goto L30
                com.vk.dto.newsfeed.entries.PixelStatsDelegate r1 = new com.vk.dto.newsfeed.entries.PixelStatsDelegate
                r1.<init>()
                r18 = r1
                goto L32
            L30:
                r18 = r37
            L32:
                r1 = 65536(0x10000, float:9.1835E-41)
                r0 = r0 & r1
                if (r0 == 0) goto L56
                r19 = r2
                r3 = r22
                r4 = r23
                r5 = r24
                r6 = r25
                r7 = r26
                r8 = r27
                r9 = r28
                r10 = r29
                r13 = r32
                r14 = r33
                r15 = r34
                r16 = r35
                r20 = r39
                r2 = r21
                goto L74
            L56:
                r19 = r38
                r2 = r21
                r3 = r22
                r4 = r23
                r5 = r24
                r6 = r25
                r7 = r26
                r8 = r27
                r9 = r28
                r10 = r29
                r13 = r32
                r14 = r33
                r15 = r34
                r16 = r35
                r20 = r39
            L74:
                r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.vkontakte.android.attachments.ShitAttachment.Card.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, float, int, com.vkontakte.android.attachments.PhotoAttachment, java.lang.String, java.lang.String, java.lang.String, com.vk.statistic.DeprecatedStatisticInterface$a, com.vk.dto.newsfeed.entries.PixelStatsDelegate, boolean, java.lang.Integer, int, xsna.zcl):void");
        }

        @Override // xsna.dqa0
        public final void F7(PixelStats pixelStats) {
            this.q.F7(pixelStats);
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.b);
            serializer.j0(this.c);
            serializer.j0(this.d);
            serializer.j0(this.e);
            serializer.j0(this.f);
            serializer.j0(this.g);
            serializer.j0(this.h);
            serializer.j0(this.i);
            serializer.P(this.j);
            serializer.S(this.k);
            serializer.i0(this.l);
            serializer.j0(this.m);
            serializer.j0(this.n);
            serializer.j0(this.o);
            serializer.i0(this.q);
            serializer.V(this.s);
            serializer.j0(this.t);
            this.p.e(serializer);
        }

        @Override // com.vk.statistic.DeprecatedStatisticInterface
        public final List<DeprecatedStatisticUrl> R6(String str) {
            return this.p.b(str);
        }

        @Override // com.vk.statistic.DeprecatedStatisticInterface
        public final int Wa() {
            Photo photo;
            Image image;
            ImageSize Cb;
            PhotoAttachment photoAttachment = this.l;
            if (photoAttachment == null || (photo = photoAttachment.l) == null || (image = photo.y) == null || (Cb = image.Cb(0, true, false)) == null) {
                return 0;
            }
            return Cb.hashCode();
        }

        @Override // com.vk.statistic.DeprecatedStatisticInterface
        public final int Y7(String str) {
            return this.p.c(str);
        }

        @Override // xsna.dqa0
        public final int b6(AdsItemBlockAdStatPixelDto.TypeDto typeDto) {
            return this.q.b6(typeDto);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Card)) {
                return false;
            }
            Card card = (Card) obj;
            return epx.f(this.b, card.b) && epx.f(this.c, card.c) && epx.f(this.d, card.d) && epx.f(this.e, card.e) && epx.f(this.f, card.f) && epx.f(this.g, card.g) && epx.f(this.h, card.h) && epx.f(this.i, card.i) && Float.compare(this.j, card.j) == 0 && this.k == card.k && epx.f(this.l, card.l) && epx.f(this.m, card.m) && epx.f(this.n, card.n) && epx.f(this.o, card.o) && epx.f(this.p, card.p) && epx.f(this.q, card.q) && this.r == card.r && epx.f(this.s, card.s);
        }

        @Override // com.vk.statistic.DeprecatedStatisticInterface
        public final void h(DeprecatedStatisticUrl deprecatedStatisticUrl) {
            this.p.a(deprecatedStatisticUrl);
        }

        public final int hashCode() {
            String str = this.b;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.c;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.d;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.e;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.g;
            int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.h;
            int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.i;
            int a2 = shy.a(this.k, io.reactivex.rxjava3.subjects.b.a(this.j, (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31, 31), 31);
            PhotoAttachment photoAttachment = this.l;
            int hashCode8 = (a2 + (photoAttachment == null ? 0 : photoAttachment.hashCode())) * 31;
            String str9 = this.m;
            int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.n;
            int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
            String str11 = this.o;
            int b = qoy.b((this.q.hashCode() + ((this.p.hashCode() + ((hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31)) * 31)) * 31, 31, this.r);
            Integer num = this.s;
            return b + (num != null ? num.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Card(link=");
            sb.append(this.b);
            sb.append(", title=");
            sb.append(this.c);
            sb.append(", deepLink=");
            sb.append(this.d);
            sb.append(", appPackage=");
            sb.append(this.e);
            sb.append(", description=");
            sb.append(this.f);
            sb.append(", followers=");
            sb.append(this.g);
            sb.append(", buttonText=");
            sb.append(this.h);
            sb.append(", buttonTextInstalled=");
            sb.append(this.i);
            sb.append(", rating=");
            sb.append(this.j);
            sb.append(", linkTarget=");
            sb.append(this.k);
            sb.append(", photo=");
            sb.append(this.l);
            sb.append(", price=");
            sb.append(this.m);
            sb.append(", oldPrice=");
            sb.append(this.n);
            sb.append(", ctaLink=");
            sb.append(this.o);
            sb.append(", statistics=");
            sb.append(this.p);
            sb.append(", pixelStatsDelegate=");
            sb.append(this.q);
            sb.append(", isSpecialCard=");
            sb.append(this.r);
            sb.append(", clickAreaBitmask=");
            return uqi.b(sb, this.s, ')');
        }

        @Override // xsna.dqa0
        public final List<PixelStats> u6(AdsItemBlockAdStatPixelDto.TypeDto typeDto) {
            return this.q.u6(typeDto);
        }

        @Override // com.vk.statistic.DeprecatedStatisticInterface
        public final void x4(String str) {
            this.p.a.remove(str);
        }

        public Card(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, float f, int i, PhotoAttachment photoAttachment, String str9, String str10, String str11, DeprecatedStatisticInterface.a aVar, PixelStatsDelegate pixelStatsDelegate, boolean z, Integer num) {
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = str5;
            this.g = str6;
            this.h = str7;
            this.i = str8;
            this.j = f;
            this.k = i;
            this.l = photoAttachment;
            this.m = str9;
            this.n = str10;
            this.o = str11;
            this.p = aVar;
            this.q = pixelStatsDelegate;
            this.r = z;
            this.s = num;
        }
    }

    public ShitAttachment(int i, int i2, String str, String str2, EntryHeader entryHeader, String str3, String str4, String str5, String str6, Links links, String str7, float f, String str8, String str9, DeprecatedStatisticUrl deprecatedStatisticUrl, String str10, String str11, int i3, String str12, String str13, String str14, String str15, int i4, String str16, Image image, PhotoAttachment photoAttachment, VideoAttachment videoAttachment, String str17, ArrayList<Card> arrayList, ej90 ej90Var, Bundle bundle, NewsEntryWithAttachments.Cut cut, boolean z, String str18, NewsEntry.TrackData trackData, UserId userId, DeprecatedStatisticInterface.a aVar, String str19, String str20, boolean z2, ArrayList<AdHideReason> arrayList2, AdSource adSource, LeadForm leadForm, DisclaimerData disclaimerData, PixelStatsDelegate pixelStatsDelegate, String str21, String str22, DisclaimerContent disclaimerContent, Flags flags, AdsChoices adsChoices, boolean z3, Integer num, String str23, Integer num2, String str24) {
        super(trackData);
        this.i = i;
        this.j = i2;
        this.k = str;
        this.l = str2;
        this.m = entryHeader;
        this.n = str3;
        this.o = str4;
        this.p = str5;
        this.q = str6;
        this.r = links;
        this.s = str7;
        this.t = f;
        this.u = str8;
        this.v = str9;
        this.w = deprecatedStatisticUrl;
        this.x = str10;
        this.y = str11;
        this.z = i3;
        this.A = str12;
        this.B = str13;
        this.C = str14;
        this.D = str15;
        this.E = i4;
        this.F = str16;
        this.G = image;
        this.H = photoAttachment;
        this.I = videoAttachment;
        this.J = str17;
        this.K = arrayList;
        this.L = ej90Var;
        this.M = bundle;
        this.N = cut;
        this.O = z;
        this.P = str18;
        this.Q = trackData;
        this.R = userId;
        this.S = aVar;
        this.T = str19;
        this.U = str20;
        this.V = z2;
        this.W = arrayList2;
        this.X = adSource;
        this.Y = leadForm;
        this.Z = disclaimerData;
        this.a0 = pixelStatsDelegate;
        this.b0 = str21;
        this.c0 = str22;
        this.d0 = disclaimerContent;
        this.e0 = flags;
        this.f0 = adsChoices;
        this.g0 = z3;
        this.h0 = num;
        this.i0 = str23;
        this.j0 = num2;
        this.k0 = str24;
    }
}
