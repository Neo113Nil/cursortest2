package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.video.ui.upload.impl.publish.presentation.albumchoose.fragment.VideoAlbumResultData;
import com.vk.video.ui.upload.impl.settings.presentation.fragment.SettingsResult;
import java.util.Date;
import java.util.List;

/* compiled from: PublishAction.kt */
/* loaded from: classes7.dex */
public interface dbe0 extends lj50 {

    /* compiled from: PublishAction.kt */
    public interface a extends dbe0 {

        /* compiled from: PublishAction.kt */
        /* renamed from: xsna.dbe0$a$a, reason: collision with other inner class name */
        public static final class C2717a implements a {
            public final SettingsResult b;

            public C2717a(SettingsResult settingsResult) {
                this.b = settingsResult;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2717a) && epx.f(this.b, ((C2717a) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "ActivityResult(result=" + this.b + ')';
            }
        }

        /* compiled from: PublishAction.kt */
        public static final class b implements a {
            public static final b b = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -18599517;
            }

            public final String toString() {
                return "Click";
            }
        }

        /* compiled from: PublishAction.kt */
        public static final class c implements a {
            public final boolean b;

            public c(boolean z) {
                this.b = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && this.b == ((c) obj).b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b);
            }

            public final String toString() {
                return defpackage.q0.a(new StringBuilder("VisibilityChange(isCompletelyVisible="), this.b, ')');
            }
        }
    }

    /* compiled from: PublishAction.kt */
    public interface b extends dbe0 {

        /* compiled from: PublishAction.kt */
        public static final class a implements b {
            public static final a b = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -1443457822;
            }

            public final String toString() {
                return "Click";
            }
        }

        /* compiled from: PublishAction.kt */
        /* renamed from: xsna.dbe0$b$b, reason: collision with other inner class name */
        public static final class C2718b implements b {
            public final List<VideoAlbumResultData> b;

            public C2718b(List<VideoAlbumResultData> list) {
                this.b = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2718b) && epx.f(this.b, ((C2718b) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return ms9.a(')', new StringBuilder("Edit(newSelectedAlbums="), this.b);
            }
        }
    }

    /* compiled from: PublishAction.kt */
    public interface c extends dbe0 {

        /* compiled from: PublishAction.kt */
        public static final class a implements c {
            public static final a b = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 646794569;
            }

            public final String toString() {
                return "Click";
            }
        }

        /* compiled from: PublishAction.kt */
        public static final class b implements c {
            public static final b b = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 799418555;
            }

            public final String toString() {
                return "CreatingNewChannel";
            }
        }

        /* compiled from: PublishAction.kt */
        /* renamed from: xsna.dbe0$c$c, reason: collision with other inner class name */
        public static final class C2719c implements c {
            public final UserId b;

            public C2719c(UserId userId) {
                this.b = userId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2719c) && epx.f(this.b, ((C2719c) obj).b);
            }

            public final int hashCode() {
                return Long.hashCode(this.b.b);
            }

            public final String toString() {
                return gp.b(new StringBuilder("Edit(newOwnerId="), this.b, ')');
            }
        }
    }

    /* compiled from: PublishAction.kt */
    public static final class d implements dbe0 {
        public static final d b = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 883165208;
        }

        public final String toString() {
            return "BackPress";
        }
    }

    /* compiled from: PublishAction.kt */
    public interface e extends dbe0 {

        /* compiled from: PublishAction.kt */
        public static final class a implements e {
            public static final a b = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 1546483461;
            }

            public final String toString() {
                return "ButtonLeftClick";
            }
        }

        /* compiled from: PublishAction.kt */
        public static final class b implements e {
            public static final b b = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 1925142536;
            }

            public final String toString() {
                return "ButtonRightClick";
            }
        }
    }

    /* compiled from: PublishAction.kt */
    public interface f extends dbe0 {

        /* compiled from: PublishAction.kt */
        public static final class a implements f {
            public static final a b = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -1356832275;
            }

            public final String toString() {
                return "Click";
            }
        }

        /* compiled from: PublishAction.kt */
        public static final class b implements f {
            public static final b b = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -1605843036;
            }

            public final String toString() {
                return "IconChangeClick";
            }
        }

        /* compiled from: PublishAction.kt */
        public static final class c implements f {
            public static final c b = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 1237327527;
            }

            public final String toString() {
                return "LoadError";
            }
        }
    }

    /* compiled from: PublishAction.kt */
    public interface g extends dbe0 {

        /* compiled from: PublishAction.kt */
        public static final class a implements g {
            public static final a b = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 544505202;
            }

            public final String toString() {
                return "Click";
            }
        }

        /* compiled from: PublishAction.kt */
        public static final class b implements g {
            public final String b;

            public b(String str) {
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("Edit(newDescription="), this.b, ')');
            }
        }
    }

    /* compiled from: PublishAction.kt */
    public interface h extends dbe0 {

        /* compiled from: PublishAction.kt */
        public static final class a implements h {
            public static final a b = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 638128308;
            }

            public final String toString() {
                return "ButtonCancelClick";
            }
        }

        /* compiled from: PublishAction.kt */
        public static final class b implements h {
            public static final b b = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -1791085040;
            }

            public final String toString() {
                return "ButtonExitClick";
            }
        }

        /* compiled from: PublishAction.kt */
        public static final class c implements h {
            public static final c b = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return -102666078;
            }

            public final String toString() {
                return "Dismiss";
            }
        }
    }

    /* compiled from: PublishAction.kt */
    public interface i extends dbe0 {
    }

    /* compiled from: PublishAction.kt */
    public interface j extends dbe0 {

        /* compiled from: PublishAction.kt */
        public static final class a implements j {
            public static final a b = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 174191856;
            }

            public final String toString() {
                return "Click";
            }
        }

        /* compiled from: PublishAction.kt */
        public static final class b implements j {
            public static final b b = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -38104182;
            }

            public final String toString() {
                return "DialogDismiss";
            }
        }

        /* compiled from: PublishAction.kt */
        public static final class c implements j {
            public final Date b;

            public c(Date date) {
                this.b = date;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && epx.f(this.b, ((c) obj).b);
            }

            public final int hashCode() {
                Date date = this.b;
                if (date == null) {
                    return 0;
                }
                return date.hashCode();
            }

            public final String toString() {
                return "Edit(newPublicationDate=" + this.b + ')';
            }
        }

        /* compiled from: PublishAction.kt */
        public static final class d implements j {
            public static final d b = new d();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return 277275409;
            }

            public final String toString() {
                return "ResetClick";
            }
        }
    }

    /* compiled from: PublishAction.kt */
    public static final class k implements dbe0 {
        public static final k b = new k();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof k);
        }

        public final int hashCode() {
            return -537914927;
        }

        public final String toString() {
            return "SaveDraftDialogButtonSaveClick";
        }
    }

    /* compiled from: PublishAction.kt */
    public static final class l implements dbe0 {
        public static final l b = new l();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof l);
        }

        public final int hashCode() {
            return -259886659;
        }

        public final String toString() {
            return "ScreenResume";
        }
    }

    /* compiled from: PublishAction.kt */
    public static final class m implements dbe0 {
        public static final m b = new m();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof m);
        }

        public final int hashCode() {
            return -1298008672;
        }

        public final String toString() {
            return "SnackbarDismissed";
        }
    }

    /* compiled from: PublishAction.kt */
    public static final class n implements dbe0 {
        public static final n b = new n();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof n);
        }

        public final int hashCode() {
            return 951642713;
        }

        public final String toString() {
            return "SpinnerCancelClick";
        }
    }

    /* compiled from: PublishAction.kt */
    public interface o extends dbe0 {

        /* compiled from: PublishAction.kt */
        public static final class a implements o, uj50 {
            public final String b;

            public a(String str) {
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("Edit(newTitle="), this.b, ')');
            }
        }

        /* compiled from: PublishAction.kt */
        public static final class b implements o {
            public final boolean b;

            public b(boolean z) {
                this.b = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.b == ((b) obj).b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b);
            }

            public final String toString() {
                return defpackage.q0.a(new StringBuilder("Focus(isFocused="), this.b, ')');
            }
        }
    }

    /* compiled from: PublishAction.kt */
    public static final class p implements dbe0 {
        public static final p b = new p();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof p);
        }

        public final int hashCode() {
            return -1406831702;
        }

        public final String toString() {
            return "ToolbarBackClick";
        }
    }

    /* compiled from: PublishAction.kt */
    public static final class q implements dbe0 {
        public static final q b = new q();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof q);
        }

        public final int hashCode() {
            return -330200538;
        }

        public final String toString() {
            return "UploadedAsClip";
        }
    }

    /* compiled from: PublishAction.kt */
    public interface r extends dbe0 {

        /* compiled from: PublishAction.kt */
        public static final class a implements r {
            public static final a b = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 77751485;
            }

            public final String toString() {
                return "ButtonClipClick";
            }
        }

        /* compiled from: PublishAction.kt */
        public static final class b implements r {
            public static final b b = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -270874168;
            }

            public final String toString() {
                return "ButtonVideoClick";
            }
        }

        /* compiled from: PublishAction.kt */
        public static final class c implements r {
            public static final c b = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 1942423873;
            }

            public final String toString() {
                return "Dismiss";
            }
        }
    }
}
