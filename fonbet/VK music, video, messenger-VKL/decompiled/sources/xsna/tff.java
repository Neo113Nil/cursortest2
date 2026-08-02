package xsna;

import android.content.DialogInterface;
import com.vk.clips.upload.vk.ui.impl.fragment.ClipsUploadFragmentImpl;
import com.vk.dto.common.id.UserId;
import java.util.List;
import ru.ok.android.externcalls.sdk.dev.MediaDumpManager;
import xsna.lbf;
import xsna.xcw0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class tff implements DialogInterface.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ tff(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i2) {
            case 0:
                String str = ClipsUploadFragmentImpl.a0;
                ((hjf) obj2).b(new lbf.a.C3246a((UserId) obj, 4));
                break;
            default:
                ((nrw0) obj2).q(new xcw0.l0((MediaDumpManager.Source) ((List) obj).get(i)));
                dialogInterface.dismiss();
                break;
        }
    }
}
