package xsna;

import com.vk.video.ui.upload.impl.publish.presentation.publish.compose.dialog.exitconfirm.ExitConfirmDialogViewState;
import com.vk.video.ui.upload.impl.publish.presentation.publish.compose.dialog.publicationdate.PublicationDateDialogViewState;
import com.vk.video.ui.upload.impl.publish.presentation.publish.compose.title.TitleViewState;
import xsna.tlo0;

/* compiled from: ScreenViewState.kt */
/* loaded from: classes7.dex */
public interface kdh0 extends lm50 {

    /* compiled from: ScreenViewState.kt */
    public static final class a implements kdh0 {
        public final tlo0.f b;
        public final skk0 c;
        public final p48 d;
        public final f9k0 e;
        public final m3k f;
        public final ld5 g;
        public final TitleViewState h;
        public final uzi0 i;
        public final uzi0 j;
        public final uzi0 k;
        public final uzi0 l;
        public final uzi0 m;
        public final szi0 n;
        public final boolean o;
        public final PublicationDateDialogViewState p;
        public final ExitConfirmDialogViewState q;

        public a(tlo0.f fVar, skk0 skk0Var, p48 p48Var, f9k0 f9k0Var, m3k m3kVar, ld5 ld5Var, TitleViewState titleViewState, uzi0 uzi0Var, uzi0 uzi0Var2, uzi0 uzi0Var3, uzi0 uzi0Var4, uzi0 uzi0Var5, szi0 szi0Var, boolean z, PublicationDateDialogViewState publicationDateDialogViewState, ExitConfirmDialogViewState exitConfirmDialogViewState) {
            this.b = fVar;
            this.c = skk0Var;
            this.d = p48Var;
            this.e = f9k0Var;
            this.f = m3kVar;
            this.g = ld5Var;
            this.h = titleViewState;
            this.i = uzi0Var;
            this.j = uzi0Var2;
            this.k = uzi0Var3;
            this.l = uzi0Var4;
            this.m = uzi0Var5;
            this.n = szi0Var;
            this.o = z;
            this.p = publicationDateDialogViewState;
            this.q = exitConfirmDialogViewState;
        }

        @Override // xsna.kdh0
        public final tlo0 e() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.b.equals(aVar.b) && epx.f(this.c, aVar.c) && this.d.equals(aVar.d) && epx.f(this.e, aVar.e) && this.f.equals(aVar.f) && epx.f(this.g, aVar.g) && this.h.equals(aVar.h) && this.i.equals(aVar.i) && epx.f(this.j, aVar.j) && this.k.equals(aVar.k) && this.l.equals(aVar.l) && epx.f(this.m, aVar.m) && this.n.equals(aVar.n) && this.o == aVar.o && epx.f(this.p, aVar.p) && epx.f(this.q, aVar.q);
        }

        @Override // xsna.kdh0
        public final skk0 g() {
            return this.c;
        }

        public final int hashCode() {
            int hashCode = Integer.hashCode(this.b.a) * 31;
            skk0 skk0Var = this.c;
            int hashCode2 = (this.d.hashCode() + ((hashCode + (skk0Var == null ? 0 : Boolean.hashCode(skk0Var.a))) * 31)) * 31;
            f9k0 f9k0Var = this.e;
            int hashCode3 = (this.f.hashCode() + ((hashCode2 + (f9k0Var == null ? 0 : f9k0Var.hashCode())) * 31)) * 31;
            ld5 ld5Var = this.g;
            int hashCode4 = (this.i.hashCode() + ((this.h.hashCode() + ((hashCode3 + (ld5Var == null ? 0 : ld5Var.hashCode())) * 31)) * 31)) * 31;
            uzi0 uzi0Var = this.j;
            int hashCode5 = (this.l.hashCode() + ((this.k.hashCode() + ((hashCode4 + (uzi0Var == null ? 0 : uzi0Var.hashCode())) * 31)) * 31)) * 31;
            uzi0 uzi0Var2 = this.m;
            int b = qoy.b((this.n.hashCode() + ((hashCode5 + (uzi0Var2 == null ? 0 : uzi0Var2.hashCode())) * 31)) * 31, 31, this.o);
            PublicationDateDialogViewState publicationDateDialogViewState = this.p;
            int hashCode6 = (b + (publicationDateDialogViewState == null ? 0 : publicationDateDialogViewState.hashCode())) * 31;
            ExitConfirmDialogViewState exitConfirmDialogViewState = this.q;
            return hashCode6 + (exitConfirmDialogViewState != null ? exitConfirmDialogViewState.b.hashCode() : 0);
        }

        @Override // xsna.kdh0
        public final f9k0 k() {
            return this.e;
        }

        @Override // xsna.kdh0
        public final p48 l() {
            return this.d;
        }

        public final String toString() {
            return "Loaded(toolbarTitle=" + this.b + ", spinner=" + this.c + ", bottomBar=" + this.d + ", snackbar=" + this.e + ", cover=" + this.f + ", author=" + this.g + ", title=" + this.h + ", description=" + this.i + ", selectedAlbums=" + this.j + ", privacyWatch=" + this.k + ", privacyComments=" + this.l + ", publicationDate=" + this.m + ", advancedSettings=" + this.n + ", isVideo2ClipsModalVisible=" + this.o + ", publicationDateDialog=" + this.p + ", exitConfirmDialog=" + this.q + ')';
        }
    }

    /* compiled from: ScreenViewState.kt */
    public static final class b implements kdh0 {
        public final tlo0.f b;
        public final skk0 c = new skk0(false);

        public b(tlo0.f fVar) {
            this.b = fVar;
        }

        @Override // xsna.kdh0
        public final tlo0 e() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.b.equals(((b) obj).b);
        }

        @Override // xsna.kdh0
        public final skk0 g() {
            return this.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b.a);
        }

        @Override // xsna.kdh0
        public final /* bridge */ /* synthetic */ f9k0 k() {
            return null;
        }

        @Override // xsna.kdh0
        public final /* bridge */ /* synthetic */ p48 l() {
            return null;
        }

        public final String toString() {
            return pr.b(new StringBuilder("Loading(toolbarTitle="), this.b, ')');
        }
    }

    tlo0 e();

    skk0 g();

    f9k0 k();

    p48 l();
}
