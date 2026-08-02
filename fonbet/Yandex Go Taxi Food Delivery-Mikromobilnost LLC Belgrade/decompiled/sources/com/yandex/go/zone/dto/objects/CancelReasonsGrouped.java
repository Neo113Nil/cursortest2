package com.yandex.go.zone.dto.objects;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.ij7;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import defpackage.xvz;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/zone/dto/objects/CancelReasonsGrouped;", "", "Companion", "CancelReason", "Group", "Comment", "$serializer", "com/yandex/go/zone/dto/objects/v", "go-client-android.features.zone:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class CancelReasonsGrouped {
    public static final v Companion = new v();
    public static final i3y[] f;
    public final String a;
    public final List b;
    public final List c;
    public final Comment d;
    public final String e;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new ij7(4)), kotlin.a.b(lazyThreadSafetyMode, new ij7(5)), null, null};
    }

    public /* synthetic */ CancelReasonsGrouped(int i, String str, List list, List list2, Comment comment, String str2) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        int i2 = i & 2;
        EmptyList emptyList = EmptyList.a;
        if (i2 == 0) {
            this.b = emptyList;
        } else {
            this.b = list;
        }
        if ((i & 4) == 0) {
            this.c = emptyList;
        } else {
            this.c = list2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = comment;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CancelReasonsGrouped)) {
            return false;
        }
        CancelReasonsGrouped cancelReasonsGrouped = (CancelReasonsGrouped) obj;
        return jl40.l(this.a, cancelReasonsGrouped.a) && jl40.l(this.b, cancelReasonsGrouped.b) && jl40.l(this.c, cancelReasonsGrouped.c) && jl40.l(this.d, cancelReasonsGrouped.d) && jl40.l(this.e, cancelReasonsGrouped.e);
    }

    public final int hashCode() {
        String str = this.a;
        int c = unr0.c(unr0.c((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c);
        Comment comment = this.d;
        int hashCode = (c + (comment == null ? 0 : comment.hashCode())) * 31;
        String str2 = this.e;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder r = xvz.r("CancelReasonsGrouped(title=", this.a, ", cancelReasons=", this.b, ", groups=");
        r.append(this.c);
        r.append(", comment=");
        r.append(this.d);
        r.append(", doneButtonTitle=");
        return oyr.t(r, this.e, Extension.C_BRAKE);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/zone/dto/objects/CancelReasonsGrouped$Group;", "", "Companion", "RatingBar", "$serializer", "com/yandex/go/zone/dto/objects/w", "go-client-android.features.zone:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes15.dex */
    public static final /* data */ class Group {
        public static final w Companion = new w();
        public static final i3y[] e = {null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ij7(6))};
        public final String a;
        public final String b;
        public final RatingBar c;
        public final List d;

        public /* synthetic */ Group(int i, String str, String str2, RatingBar ratingBar, List list) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str2;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = ratingBar;
            }
            if ((i & 8) == 0) {
                this.d = EmptyList.a;
            } else {
                this.d = list;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Group)) {
                return false;
            }
            Group group = (Group) obj;
            return jl40.l(this.a, group.a) && jl40.l(this.b, group.b) && jl40.l(this.c, group.c) && jl40.l(this.d, group.d);
        }

        public final int hashCode() {
            String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            RatingBar ratingBar = this.c;
            return this.d.hashCode() + ((hashCode2 + (ratingBar != null ? ratingBar.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder v = b64.v("Group(id=", this.a, ", title=", this.b, ", ratingBar=");
            v.append(this.c);
            v.append(", reasons=");
            v.append(this.d);
            v.append(Extension.C_BRAKE);
            return v.toString();
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/dto/objects/CancelReasonsGrouped$Group$RatingBar;", "", "Companion", "$serializer", "com/yandex/go/zone/dto/objects/x", "go-client-android.features.zone:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final /* data */ class RatingBar {
            public static final x Companion = new x();
            public final String a;

            public /* synthetic */ RatingBar(int i, String str) {
                if ((i & 1) == 0) {
                    this.a = null;
                } else {
                    this.a = str;
                }
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof RatingBar) && jl40.l(this.a, ((RatingBar) obj).a);
            }

            public final int hashCode() {
                String str = this.a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                return oyr.p("RatingBar(title=", this.a, Extension.C_BRAKE);
            }

            public RatingBar() {
                this.a = null;
            }
        }

        public Group() {
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = EmptyList.a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/zone/dto/objects/CancelReasonsGrouped$Comment;", "", "Companion", "CommentModal", "$serializer", "com/yandex/go/zone/dto/objects/u", "go-client-android.features.zone:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes15.dex */
    public static final /* data */ class Comment {
        public static final u Companion = new u();
        public final String a;
        public final CommentModal b;

        public /* synthetic */ Comment(int i, String str, CommentModal commentModal) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = commentModal;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Comment)) {
                return false;
            }
            Comment comment = (Comment) obj;
            return jl40.l(this.a, comment.a) && jl40.l(this.b, comment.b);
        }

        public final int hashCode() {
            String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            CommentModal commentModal = this.b;
            return hashCode + (commentModal != null ? commentModal.hashCode() : 0);
        }

        public final String toString() {
            return "Comment(hint=" + this.a + ", commentModal=" + this.b + Extension.C_BRAKE;
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/dto/objects/CancelReasonsGrouped$Comment$CommentModal;", "", "Companion", "$serializer", "com/yandex/go/zone/dto/objects/t", "go-client-android.features.zone:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final /* data */ class CommentModal {
            public static final t Companion = new t();
            public final String a;
            public final String b;

            public /* synthetic */ CommentModal(int i, String str, String str2) {
                if ((i & 1) == 0) {
                    this.a = null;
                } else {
                    this.a = str;
                }
                if ((i & 2) == 0) {
                    this.b = null;
                } else {
                    this.b = str2;
                }
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof CommentModal)) {
                    return false;
                }
                CommentModal commentModal = (CommentModal) obj;
                return jl40.l(this.a, commentModal.a) && jl40.l(this.b, commentModal.b);
            }

            public final int hashCode() {
                String str = this.a;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.b;
                return hashCode + (str2 != null ? str2.hashCode() : 0);
            }

            public final String toString() {
                return unr0.p("CommentModal(title=", this.a, ", doneButtonTitle=", this.b, Extension.C_BRAKE);
            }

            public CommentModal() {
                this.a = null;
                this.b = null;
            }
        }

        public Comment() {
            this.a = null;
            this.b = null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/dto/objects/CancelReasonsGrouped$CancelReason;", "", "Companion", "$serializer", "com/yandex/go/zone/dto/objects/s", "go-client-android.features.zone:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes15.dex */
    public static final /* data */ class CancelReason {
        public static final s Companion = new s();
        public final String a;
        public final String b;
        public final String c;

        public /* synthetic */ CancelReason(int i, String str, String str2, String str3) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str2;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = str3;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CancelReason)) {
                return false;
            }
            CancelReason cancelReason = (CancelReason) obj;
            return jl40.l(this.a, cancelReason.a) && jl40.l(this.b, cancelReason.b) && jl40.l(this.c, cancelReason.c);
        }

        public final int hashCode() {
            String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.c;
            return hashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            return oyr.t(b64.v("CancelReason(iconTag=", this.a, ", title=", this.b, ", id="), this.c, Extension.C_BRAKE);
        }

        public CancelReason() {
            this.a = null;
            this.b = null;
            this.c = null;
        }
    }

    public CancelReasonsGrouped() {
        this.a = null;
        EmptyList emptyList = EmptyList.a;
        this.b = emptyList;
        this.c = emptyList;
        this.d = null;
        this.e = null;
    }
}
