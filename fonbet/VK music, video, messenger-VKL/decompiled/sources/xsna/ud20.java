package xsna;

import android.content.Context;
import android.content.DialogInterface;
import android.util.Size;
import android.view.Window;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessage;
import com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessageButton;
import com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessageIcon;
import com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessageText;
import com.vk.newsfeed.posting.impl.presentation.base.fragment.PostingFragment;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.NoWhenBranchMatchedException;
import xsna.fmc0;
import xsna.h7u0;
import xsna.ikv0;
import xsna.ua20;

/* compiled from: MessagesDelegate.kt */
/* loaded from: classes4.dex */
public final class ud20 {
    public final PostingFragment.d a;
    public ikv0 b;

    public ud20(PostingFragment.d dVar) {
        this.a = dVar;
    }

    public static String a(PostingUserMessageText postingUserMessageText, Context context) {
        if (postingUserMessageText instanceof PostingUserMessageText.ResText) {
            return context.getString(((PostingUserMessageText.ResText) postingUserMessageText).b);
        }
        if (postingUserMessageText instanceof PostingUserMessageText.StringText) {
            return ((PostingUserMessageText.StringText) postingUserMessageText).b;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void b(Context context, fmc0.p pVar) {
        final PostingAction postingAction = pVar.b;
        PostingUserMessage postingUserMessage = pVar.a;
        PostingAction postingAction2 = null;
        if (postingUserMessage instanceof PostingUserMessage.Snackbar) {
            PostingUserMessage.Snackbar snackbar = (PostingUserMessage.Snackbar) postingUserMessage;
            h4x h4xVar = pVar.c;
            Window window = pVar.d;
            PostingUserMessageText postingUserMessageText = snackbar.c;
            PostingUserMessageButton postingUserMessageButton = snackbar.d;
            String a = a(postingUserMessageText, context);
            ikv0.a aVar = new ikv0.a(context);
            PostingUserMessageIcon postingUserMessageIcon = snackbar.b;
            if (postingUserMessageIcon != null) {
                aVar.t = new ikv0.c.C3058c(postingUserMessageIcon.b, Integer.valueOf(postingUserMessageIcon.c), (Size) null, 12);
            }
            aVar.u = new ikv0.d(new ikv0.d.c(a, 3), (ikv0.d.b) null, (postingUserMessageIcon == null || postingUserMessageButton == null) ? null : new ikv0.d.a(a(postingUserMessageButton.b, context), null, new n9(14, postingUserMessageButton, this), Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), 2);
            if (postingUserMessageIcon == null && postingUserMessageButton != null) {
                aVar.s = new ikv0.e.a(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, a(postingUserMessageButton.b, context), new gd5(postingUserMessageButton, postingAction, this, 7));
            }
            int i = ify.a;
            if (ify.e(ify.c)) {
                aVar.e(iah0.a(8) + ify.d(3, null));
            } else {
                aVar.e(iah0.a(8) + h4xVar.d);
            }
            aVar.d = true;
            aVar.h = new g1j(this, 26);
            this.b = window != null ? aVar.p(window) : aVar.n();
            return;
        }
        boolean z = postingUserMessage instanceof PostingUserMessage.PopupDialog;
        PostingFragment.d dVar = this.a;
        if (z) {
            new ua20.a(context, (PostingUserMessage.PopupDialog) postingUserMessage, postingAction, dVar).I0(null);
            return;
        }
        if (postingUserMessage instanceof PostingUserMessage.AlertDialog) {
            final PostingUserMessage.AlertDialog alertDialog = (PostingUserMessage.AlertDialog) postingUserMessage;
            int i2 = h7u0.p;
            h7u0.a c = h7u0.b.c(context);
            c.h0(a(alertDialog.b, context));
            PostingUserMessageText postingUserMessageText2 = alertDialog.c;
            c.a.f = postingUserMessageText2 != null ? a(postingUserMessageText2, context) : null;
            final PostingUserMessageButton postingUserMessageButton2 = alertDialog.e;
            if (postingUserMessageButton2 != null) {
                c.X(a(postingUserMessageButton2.b, context), new DialogInterface.OnClickListener() { // from class: xsna.rd20
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i3) {
                        PostingUserMessageButton postingUserMessageButton3 = PostingUserMessageButton.this;
                        boolean z2 = postingUserMessageButton3.e;
                        PostingAction postingAction3 = postingUserMessageButton3.c;
                        if (z2) {
                            postingAction3 = com.vk.newsfeed.posting.impl.domain.model.d.a(postingAction3, postingAction);
                        }
                        if (postingAction3 != null) {
                            this.a.invoke(postingAction3);
                        }
                        dialogInterface.cancel();
                    }
                });
            }
            PostingUserMessageButton postingUserMessageButton3 = alertDialog.d;
            if (postingUserMessageButton3 != null) {
                c.d0(a(postingUserMessageButton3.b, context), new DialogInterface.OnClickListener() { // from class: xsna.sd20
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i3) {
                        PostingUserMessageButton postingUserMessageButton4 = PostingUserMessage.AlertDialog.this.d;
                        boolean z2 = postingUserMessageButton4.e;
                        PostingAction postingAction3 = postingUserMessageButton4.c;
                        if (z2) {
                            postingAction3 = com.vk.newsfeed.posting.impl.domain.model.d.a(postingAction3, postingAction);
                        }
                        if (postingAction3 != null) {
                            this.a.invoke(postingAction3);
                        }
                        dialogInterface.dismiss();
                    }
                });
            }
            PostingUserMessageButton postingUserMessageButton4 = alertDialog.f;
            if (postingUserMessageButton4 != null) {
                c.Y(a(postingUserMessageButton4.b, context), new td20(postingUserMessageButton4, postingAction, this, 0));
            }
            c.m();
            return;
        }
        if (!(postingUserMessage instanceof PostingUserMessage.Service)) {
            throw new NoWhenBranchMatchedException();
        }
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.d, new Object[]{"Posting rule check failed without notification. Failed rule: " + ((PostingUserMessage.Service) postingUserMessage).b});
        }
        PostingUserMessage.Service service = (PostingUserMessage.Service) postingUserMessage;
        if (!service.d) {
            postingAction2 = service.c;
        } else if (postingAction != null) {
            postingAction2 = com.vk.newsfeed.posting.impl.domain.model.d.a(postingAction, service.c);
        }
        if (postingAction2 != null) {
            dVar.invoke(postingAction2);
        }
    }
}
