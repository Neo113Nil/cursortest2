package com.vkontakte.android;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.Peer;
import com.vkontakte.android.activities.LogoutReceiver;
import java.util.Arrays;
import xsna.g2v;
import xsna.xa4;

/* loaded from: classes7.dex */
public class RepostActivity extends Activity {
    public LogoutReceiver b;
    public Attachment[] c;

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i2 != -1) {
            finish();
            return;
        }
        if (i == 201) {
            g2v.c().b().B(this, (Peer) intent.getParcelableExtra("dialog_id"), "", Arrays.asList(this.c), "share", null, false);
        }
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        Parcelable[] parcelableArray;
        super.onCreate(bundle);
        this.b = LogoutReceiver.a(this);
        overridePendingTransition(0, 0);
        Bundle extras = getIntent().getExtras();
        if (extras != null && extras.containsKey("attachments") && (parcelableArray = extras.getParcelableArray("attachments")) != null) {
            this.c = new Attachment[parcelableArray.length];
            for (int i = 0; i < parcelableArray.length; i++) {
                this.c[i] = (Attachment) parcelableArray[i];
            }
        }
        setContentView(new View(this));
        Attachment[] attachmentArr = this.c;
        if (attachmentArr == null || attachmentArr.length <= 0) {
            finish();
        } else {
            g2v.c().b().W(xa4.L(this), new Bundle(), false);
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        this.b.b();
        super.onDestroy();
    }
}
