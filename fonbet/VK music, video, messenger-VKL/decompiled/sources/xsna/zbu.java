package xsna;

import android.content.Intent;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.vk.api.base.Document;
import com.vk.dto.common.id.UserId;
import com.vkontakte.android.attachments.GraffitiAttachment;

/* compiled from: GraffitiConfirmDialog.java */
/* loaded from: classes15.dex */
public final class zbu implements View.OnClickListener {
    public final /* synthetic */ Document b;
    public final /* synthetic */ FragmentActivity c;
    public final /* synthetic */ j34 d;
    public final /* synthetic */ acu e;

    public zbu(acu acuVar, Document document, FragmentActivity fragmentActivity, j34 j34Var) {
        this.e = acuVar;
        this.b = document;
        this.c = fragmentActivity;
        this.d = j34Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Intent intent = new Intent();
        intent.putExtra("result_graffiti", new GraffitiAttachment(this.b));
        Intent intent2 = this.c.getIntent();
        if (intent2 != null) {
            UserId userId = (UserId) intent2.getParcelableExtra("owner_id");
            int intExtra = intent2.getIntExtra("post_id", 0);
            long longExtra = intent2.getLongExtra("peer_id", 0L);
            intent.putExtra("owner_id", userId);
            intent.putExtra("post_id", intExtra);
            intent.putExtra("peer_id", longExtra);
        }
        j34 j34Var = this.d;
        if (j34Var != null) {
            j34Var.V2(intent);
        }
        this.e.dismiss();
    }
}
