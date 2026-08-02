package xsna;

import android.content.Context;
import android.net.Uri;
import android.widget.ProgressBar;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.core.network.model.HttpRequest;
import com.vk.dto.attaches.AttachDoc;
import com.vk.ecomm.market.attached.TaggedItemsBottomSheet;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.messages.MessagesType;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.permission.PermissionHelper;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.e24;
import xsna.gm50;
import xsna.z0o0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class vqb implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ vqb(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                ChatFragment chatFragment = (ChatFragment) obj5;
                Dialog dialog = (Dialog) obj4;
                Msg msg = (Msg) obj3;
                AttachDoc attachDoc = (AttachDoc) obj2;
                e24.a aVar = (e24.a) obj;
                ChatFragment.d dVar = ChatFragment.w1;
                if (aVar instanceof e24.a.b) {
                    chatFragment.jo().D(chatFragment, new p14(dialog.Zb(), msg.b, attachDoc.b, MessagesType.DIALOG));
                    edw edwVar = edw.a;
                    edw.g(R.string.vkim_download_started, chatFragment.requireContext());
                } else if (aVar instanceof e24.a.c) {
                    edw edwVar2 = edw.a;
                    edw.d(R.string.vkim_download_impossible, chatFragment.requireContext(), true);
                } else {
                    if (!(aVar instanceof e24.a.C2773a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    chatFragment.r0.getClass();
                    Context requireContext = chatFragment.requireContext();
                    Uri fromFile = Uri.fromFile(((e24.a.C2773a) aVar).a.i1());
                    String scheme = fromFile.getScheme();
                    String lastPathSegment = fromFile.getLastPathSegment();
                    if (scheme == null || !(scheme.equals("http") || scheme.equals(HttpRequest.DEFAULT_SCHEME))) {
                        vao.g(requireContext, fromFile.toString());
                    } else if (!vao.j(requireContext, fromFile, true)) {
                        grb grbVar = new grb(requireContext, lastPathSegment, fromFile, 8);
                        if (gz80.a(34)) {
                            grbVar.invoke();
                        } else {
                            PermissionHelper permissionHelper = PermissionHelper.a;
                            permissionHelper.getClass();
                            permissionHelper.d(requireContext, PermissionHelper.e, R.string.vk_permissions_storage, R.string.vk_permissions_storage, grbVar, null);
                        }
                    }
                }
                return s3q0.a;
            case 1:
                izs izsVar = (izs) obj3;
                String[] strArr = (String[]) obj2;
                List list = (List) obj;
                PermissionHelper.A.onNext(new gy90((FragmentActivity) obj5, rl3.C((String[]) obj4)));
                if (izsVar != null) {
                    izsVar.invoke(list);
                }
                PermissionHelper.a.getClass();
                PermissionHelper.w(strArr);
                return s3q0.a;
            default:
                int i2 = TaggedItemsBottomSheet.o1;
                bwt0.p0((RecyclerView) obj5, true);
                bwt0.p0((ProgressBar) obj4, false);
                gm50.a.a((TaggedItemsBottomSheet) obj3, ((z0o0.a) obj).a, new hij0((g010) obj2, 7));
                return s3q0.a;
        }
    }
}
