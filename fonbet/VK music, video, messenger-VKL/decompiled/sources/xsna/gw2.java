package xsna;

import com.vk.antispam.ChatSpamAction;
import com.vk.antispam.ProfileSpamAction;
import com.vk.antispam.SpamAction;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.tlo0;

/* compiled from: AntispamUiModelMapper.kt */
/* loaded from: classes14.dex */
public final class gw2 {
    public static final gw2 a = new gw2();

    public static mhk0 a(lhk0 lhk0Var, String str) {
        int i;
        SpamAction spamAction = lhk0Var.a;
        ChatSpamAction.ExitChatAndClearHistory exitChatAndClearHistory = ChatSpamAction.ExitChatAndClearHistory.b;
        if (epx.f(spamAction, exitChatAndClearHistory)) {
            i = R.string.dialog_bar_spam_action_exit_chat_and_clear_history_title;
        } else {
            if (!epx.f(spamAction, ChatSpamAction.Report.b)) {
                if (epx.f(spamAction, ProfileSpamAction.BlackList.b)) {
                    i = R.string.dialog_bar_spam_action_blacklist_title;
                } else if (epx.f(spamAction, ProfileSpamAction.DeleteChat.b)) {
                    i = R.string.dialog_bar_spam_action_delete_title;
                } else if (!epx.f(spamAction, ProfileSpamAction.Report.b)) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            i = R.string.dialog_bar_spam_action_report_title;
        }
        tlo0.f h = tq.h(tlo0.Companion, i);
        tlo0 tlo0Var = null;
        if (!epx.f(spamAction, exitChatAndClearHistory)) {
            if (epx.f(spamAction, ChatSpamAction.Report.b)) {
                tlo0Var = new tlo0.f(R.string.dialog_bar_spam_action_report_subtitle);
            } else if (epx.f(spamAction, ProfileSpamAction.BlackList.b)) {
                tlo0Var = tlo0.a.c(R.string.dialog_bar_spam_action_blacklist_subtitle, str);
            } else if (!epx.f(spamAction, ProfileSpamAction.DeleteChat.b)) {
                if (!epx.f(spamAction, ProfileSpamAction.Report.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                tlo0Var = new tlo0.f(R.string.dialog_bar_spam_action_report_subtitle);
            }
        }
        return new mhk0(h, tlo0Var, lhk0Var.b, spamAction);
    }
}
