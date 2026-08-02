package xsna;

import com.vk.articleeditor.impl.di.ArticleComponentImpl;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.core.preference.Preference;
import com.vk.poll.fragments.PollUserListFragment;
import xsna.lu;
import xsna.xvl;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class jb implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ jb(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return new zi50();
            case 1:
                return new lu.a();
            case 2:
                qcy<Object>[] qcyVarArr = ArticleComponentImpl.c;
                return new vn3();
            case 3:
                int i = qr6.q;
                return "UPLOAD_TRACE convert: converting with overlays";
            case 4:
                r55 r55Var = r55.a;
                Object i2 = r55.i();
                qou0 qou0Var = i2 instanceof qou0 ? (qou0) i2 : null;
                if (qou0Var != null) {
                    return qou0Var.a();
                }
                return null;
            case 5:
                int i3 = ClipFeedListFragment.a2;
                return new ClipFeedListFragment.e();
            case 6:
                return new fnd();
            case 7:
                return new io.reactivex.rxjava3.disposables.g();
            case 8:
                return new mff();
            case 9:
                return new mcq0();
            case 10:
                com.vk.voip.ui.c.b.getClass();
                com.vk.voip.ui.c.j0().N();
                return s3q0.a;
            case 11:
                return s3q0.a;
            case 12:
                return new j6h(0);
            case 13:
                return new byn(new dy2());
            case 14:
                return new xvl.c();
            case 15:
                return new xrm(null, null, null, null, 15);
            case 16:
                return new yf3();
            case 17:
                return new gwh0(null);
            case 18:
                return "#ImEnvironment: shutdown() start...";
            case 19:
                return a0a.d;
            case 20:
                return new jl80();
            case 21:
                return s3q0.a;
            case 22:
                return new j2r0();
            case 23:
                return s3q0.a;
            case 24:
                return s3q0.a;
            case 25:
                return s3q0.a;
            case 26:
                return Preference.f("video_multitrack_highlight");
            case 27:
                return s3q0.a;
            case 28:
                return new uw80();
            default:
                int i4 = PollUserListFragment.U0;
                return new j2r0();
        }
    }

    public /* synthetic */ jb(ClipFeedListFragment clipFeedListFragment) {
        this.b = 5;
    }
}
